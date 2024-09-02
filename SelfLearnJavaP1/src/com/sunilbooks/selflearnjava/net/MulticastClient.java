package com.sunilbooks.selflearnjava.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Date;

/**
 * Creates a multicast client that receives broadcast messages. The client
 * joins a multicast group identified by the IP address "202.0.202.0" and 
 * listens on port number 3336.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MulticastClient {

    /**
     * The main method that sets up the multicast client, joins the multicast 
     * group, receives and prints broadcast messages, and then leaves the 
     * group and closes the socket.
     * 
     * @param args command-line arguments (not used)
     * @throws Exception if an error occurs during socket operations or group 
     *         management
     */
    public static void main(String[] args) throws Exception {

        // Create socket and setup group port 3336
        MulticastSocket socket = new MulticastSocket(3336);

        // Setup group IP address "202.0.202.0"
        InetAddress group = InetAddress.getByName("202.0.202.0");

        // Join the group
        socket.joinGroup(group);

        System.out.println("Ready to receive broadcast message " + new Date());

        // Create empty packet
        byte[] buf = new byte[256];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        for (int i = 0; i < 3; i++) {

            // Receive broadcasted message
            socket.receive(packet);

            // Print message
            String received = new String(packet.getData());
            System.out.println("Message: " + received);
        }

        // Leave the group
        socket.leaveGroup(group);

        // Close the socket
        socket.close();
    }
}
