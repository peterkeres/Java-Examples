package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Mimics a server that receives a file, stores a copy of it, and checks it to see if its the same as
 * the stored file.
 */
public class Server {


    // Instance variables
    private Socket socket;
    private ServerSocket server;
    private int port, fileCount = 0;
    private BufferedReader fromClient;
    private FileOutputStream outputFile;
    private Long timer;
    private ArrayList<Long> totalTimes;


    /**
     * Constructor
     * @param port - is the port number the server should listen on
     */
    public Server(int port){
        this.port = port;
        totalTimes = new ArrayList<Long>();


        System.out.println(("Server Started, on port number " + port+"\n\n").toUpperCase());
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * looks/waits for the connection from the client
     */
    public void awaitConnection(){
        System.out.println("Waiting for connection from client");

        try {
            socket = server.accept();
            System.out.println("Client Connected!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * receives data from the client and creates a file for each file that is sent from the client
     */
    public void receiveData(){
        try {
            // setting up input stream and output stream for the data being sent
            fromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            fileCount++;
            outputFile = new FileOutputStream("java_20/server/receivedFiles/receivedFile"+fileCount+".txt");
            char[] receivedData = new char[2048];
            String section = null;

            //read first chuck of data and start timer
            int dataRead = fromClient.read(receivedData,0,2048);
            startTimer();

            //Read the rest of the files worth of data
            while ( dataRead != -1){
                section = new String(receivedData, 0, dataRead);
                outputFile.write(section.getBytes());

                dataRead = fromClient.read(receivedData, 0, 2048);
            }

            //stop timers
            endTimer();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * closes the connection with the client
     */
    public void closeConnection(){

        try {
            fromClient.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Turns off the server, aka no longer accepts connections
     * displays out the amount of time total spent on receiving files
     */
    public void killServer(){

        try {
            server.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // figuring out avg time for all files received
        long temp = 0;
        for (Long time : totalTimes) {
            temp += time;
        }
        long avgTime = temp / fileCount;

        // ending messages
        String outMessage = "\n\nThe avg time to receive "+fileCount+" files is: "+avgTime+"MS";
        System.out.println(outMessage.toUpperCase());
        System.out.println("SERVER IS DONE!");
    }

    /**
     * starts the timer for the current file being received
     */
    public void startTimer(){
        timer = System.currentTimeMillis();
        System.out.println("Receiving file \'sendingFile.txt\' for the " + (fileCount)+ " time");
    }

    /**
     * stops timer for the current file being received
     */
    public void endTimer(){
        long time = System.currentTimeMillis() - timer;
        totalTimes.add(time);

        System.out.println("Finished receiving \'sendingFile.txt\' for the "+fileCount+" time");
        System.out.println("Time to receive the file was "+time+"MS\n");
    }


    /**
     * compare all files that are received to the standard file and checks for errors
     */
    public void compareAllFiles(){

        // setting up objects for comparing files
        System.out.println("Start of checking process of all files");
        String file = "";
        int fileErrors = 0;
        FileWriter logFile = null;
        BufferedWriter logFileOut = null;

        try {
            logFile = new FileWriter("java_20/server/logFile.txt");
            logFileOut = new BufferedWriter(logFile);

        } catch (IOException e) {
            e.printStackTrace();
        }


        // for loop to check over all files and updates logfiles
        for (int currentFile = 1; currentFile <= fileCount; currentFile++) {
            file = "java_20/server/receivedFiles/receivedFile"+currentFile+".txt";

            try {
                if (compareFile(file,"java_20/server/standardFile.txt") == false ){
                    fileErrors++;
                    logFileOut.write("ReceivedFile"+currentFile+":\tERROR!!!!\n");
                }
                else
                    logFileOut.write("ReceivedFile"+currentFile+":\tpassed\n");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        // closing files and messages
        try {
            logFileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of errors found: " + fileErrors);
        System.out.println("check \'logFile.txt\' for details");

    }


    /**
     * Compares 2 files to check if they are the same
     * @param fileOne path to file one
     * @param fileTwo path to file two
     * @return if files are the same or not
     * @throws Exception
     */
    public static boolean compareFile(String fileOne, String fileTwo) throws Exception
    {
        File f1 = new File(fileOne);
        File f2 = new File(fileTwo);

        FileReader fR1 = new FileReader(f1);
        FileReader fR2 = new FileReader(f2);

        BufferedReader reader1 = new BufferedReader(fR1);
        BufferedReader reader2 = new BufferedReader(fR2);

        String line1 = null;
        String line2 = null;

        boolean flag = true;
        while((flag == true) && ((line1 = reader1.readLine()) != null)&&((line2 = reader2.readLine())!= null))
        {
            if(!line1.equals(line2))
                flag = false;
            else
                flag = true;
        }
        reader1.close();
        reader2.close();

        return flag;
    }


    /**
     * main run of server
     * @param args
     */
    public static void main(String[] args) {
        // NOTE: the port number and the files to receive need to be the same here and on client
        int port = 4000;
        int timesReceiveFile = 100;

        Server server = new Server(port);

        for (int i = 0; i < timesReceiveFile; i++) {
            server.awaitConnection();
            server.receiveData();
            server.closeConnection();
        }

        server.compareAllFiles();
        server.killServer();

    }
}
