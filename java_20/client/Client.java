package client;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Mimics a client that sends a file over to the server
 */
public class Client {

    // object level variables
    private Socket socket;
    private DataOutputStream outputServer;
    private String ipAddress;
    private int port, fileSentCount;
    private ArrayList<Long> totalTimes;
    private long timer;


    /**
     * constructor
     * @param ipAddress of the server to connect too
     * @param port port number the server is listening on
     */
    public Client(String ipAddress, int port){
        this.ipAddress = ipAddress;
        this.port = port;
        fileSentCount = 0;
        totalTimes = new ArrayList<Long>();
    }


    /**
     * makes a connection to the server
     */
    public void openConnect(){
        System.out.println("Connecting to " + ipAddress + " at port " + port);

        boolean notConnected = true;

        // keeps trying to make connection to server
        while (notConnected){
            try{
                socket = new Socket(ipAddress, port);

                System.out.println("Connected!!");
                notConnected = false;
            } catch (UnknownHostException e) {
                System.out.println("CONNECTION FAILED");
                System.out.println(e);
            } catch (IOException e) {
                System.out.println("CONNECTION FAILED");
                System.out.println(e);
            }

            if (notConnected){
                try {
                    System.out.println("Trying again...");
                    TimeUnit.SECONDS.sleep(5);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * sends data from file over to server
     */
    public void sendData(){

       // sets up objects to send over data
        try {
            outputServer = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("java_20/client/sendingFile.txt");
        FileInputStream fileStream = null;

        try {
            fileStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] sendData = new byte[1024];


        // process of sending over data
        try {
            startTimer();
            int dataRead = fileStream.read(sendData);

            while (dataRead != -1){
                String section = new String(sendData);
                outputServer.writeBytes(section);

                sendData = new byte[1024];
                dataRead = fileStream.read(sendData);

                if (dataRead < 1024 && dataRead != -1){
                    byte[] temp = new byte[dataRead];
                    System.arraycopy(sendData,0,temp,0,dataRead);
                    sendData = temp;
                }

            }

            endTimer();

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            fileStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * closes connection to the server
     */
    public void closeConnection(){

        try {
            socket.close();
            outputServer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * starts timer for a file being sent
     */
    public void startTimer(){
        timer = System.currentTimeMillis();
        System.out.println("sending file \'sendingFile.txt\' for the " + (fileSentCount+1)+ " time");
    }

    /**
     * stops timer for the file being sent
     */
    public void endTimer(){
        long time = System.currentTimeMillis() - timer;
        totalTimes.add(time);
        fileSentCount++;


        System.out.println("Finished sending \'sendingFile.txt\' for the "+fileSentCount+" time");
        System.out.println("Time to send the file was "+time+"MS\n");
    }

    /**
     * final messages from the client and displays avg time to send file
     */
    public void killClient(){

        // gets the avg time of total time for files sent
        long temp = 0;
        for (Long time : totalTimes) {
            temp += time;
        }
        long avgTime = temp / fileSentCount;

        // final messages
        String outMessage = "\n\nThe avg time to send "+fileSentCount+" files is: "+avgTime+"MS";
        System.out.println(outMessage.toUpperCase());
        System.out.println("CLIENT IS DONE!");

    }


    /**
     * main run of the program from the client
     * @param args
     */
    public static void main(String[] args) {
        // NOTE: change ip address to ip address needed
        String ipAddress = "192.168.1.3";
        //NOTE: make sure the prot number and the number of times to send file is the same in server
        int port = 4000;
        int timesSendFile = 100;

        Client client = new Client(ipAddress,port);

        for (int i = 0; i < timesSendFile; i++) {
            client.openConnect();
            client.sendData();
            client.closeConnection();
        }

        client.killClient();

    }
}
