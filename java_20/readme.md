# Programming Project for TCP Socket Programming

> with Java Language CPSC 5157U

**Objectives:** Understand how socket works. Explore socket programming. Have a deep understanding about TCP protocol in terms of transferring file precisely and efficiently. Learn what a stream is and the differences between input and output stream. Understand how to attach a stream to a device/socket. Exercise how to design and implement a protocol which controls the communication between server and client side. 

**Description:** In this project, you are required to make a program to transfer the same file from client side to server side for one hundred times with TCP protocol. Every time as long as the file is transferred, compare with the stored standard file to see they are the same. If the received file is the same as the stored file, it means the file is transferred correctly, otherwise incorrectly.  Count the transferring error rate (number of times incorrect file received at server side out of one hundred times) for TCP to see its reliability. At the meantime, count the time in mili-second cost to transfer the same file for hundred times with TCP.  

**Detailed Requirements:** 
1. You need to make two programs including one client side (C), one server side (S).
1. You can finish it by making TCP code.
1. Use non-persistent TCP connection.  
1. Please use Java language (preferred Blue J). Using any other languages will result in zero of your project. 
1.	Your client and server side program may run in the same hosts, but must use the Internet IP address, other than 127.0.0.0, or “local host”.  
1.	You client side program sends the same file (see the sample text format file) to the server side for one hundred times.
1.	You server side program receives the file. Every time as long as the file is completely received, please store in at the server side in different name and compare it with the sample file (stored at server side in advance) to see if they are the same. If the received file is different from the stored file, count one time incorrect transfer. 
1.	Use TCP socket to finish file transferring for one hundred times, count the number of time that incurs incorrect transfer, and count the average time used for one hundred times transferring at server side. The time used to deliver the file includes connection setup time, data transferring time, and connection close up time. 
1.	When running your server side code, it must display at least the following information:
     I am ready for any client side request
      1. I am starting receiving file “xyz” for the nth  time
      1. I am finishing receiving file “xyz” for the nth time 
      1. The time used in millisecond to receive “xyz” for nth time is:
      1. The average time to receive file “xyz” in millisecond is:
      1. I am done 
1.	When running your client side code, it must display at least the following information:
      1. I am connecting to server side: server IP address
      1. I am sending file “xyz” for the nth  time
      1. I am finishing sending file “xyz” for the nth time 
      1. The time used in millisecond to send “xyz” for nth time is:
      1. The average time to send file “xyz” in millisecond is:
      1. I am done 

**Submission through D2L Dropbox (zip the following into one file for submission):**

1.	Two screenshot to show the running results with one for client side, and another one for server side. 
2.	Client side Java source code.
3.	Server side Java source code.  

