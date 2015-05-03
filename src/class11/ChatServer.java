/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shahzad
 */
public class ChatServer {

    public static void main(String[] args) {
        try {
            // 1. Server Setup
            ServerSocket server = new ServerSocket(6666);
            System.out.println("Server is up and running ... ");

            // 2. Listen to New Clients
            Socket client = server.accept();
            System.out.println("-->New Client:" + client);

            // 3. Input Stream Building 
            BufferedInputStream bis
                    = new BufferedInputStream(
                            client.getInputStream());
            BufferedOutputStream bos
                    = new BufferedOutputStream(
                            client.getOutputStream());

            // 4. Read Data From Clients 
            byte[] b = new byte[1024];
            while (true) {
                int read = bis.read(b);
                String s = new String(b, 0, read);
                System.out.println("--> ["
                        + new java.util.Date(System.currentTimeMillis())
                        + "] : " + s);

                // Echo back to client
                s = s.concat(":Test");
                //bos.write(b, 0, read);
                bos.write(s.getBytes());
                bos.flush();
            }
        } catch (IOException ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
