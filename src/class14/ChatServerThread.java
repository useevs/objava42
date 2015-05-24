/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

import class11.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.rmi.server.UnicastRef;

/**
 *
 * @author shahzad
 */
public class ChatServerThread {

    public static void main(String[] args) {
        try {
            // 1. Server Setup
            ServerSocket server = new ServerSocket(6666);
            Executor pool = Executors.newCachedThreadPool();
            System.out.println("Server is up and running ... ");

            while (true) {
                // 2. Listen to New Clients
                final Socket client = server.accept();
                System.out.println("-->New Client:" + client);

                pool.execute(new Runnable() {
                    @Override
                    public void run() {
                        BufferedInputStream bis = null;
                        BufferedOutputStream bos = null;
                        try {

                            // 3. Input Stream Building 
                            bis = new BufferedInputStream(
                                    client.getInputStream());

                            bos = new BufferedOutputStream(
                                    client.getOutputStream());
                        } catch (Exception e) {
                        }
                        // 4. Read Data From Clients 
                        byte[] b = new byte[1024];
                        int readCount = 0;
                        while (true) {
                            try {
                                try {
                                    int read = bis.read(b);
                                    if (read > 0) {
                                        readCount = 0;
                                    }
                                    String s = new String(b, 0, read);
                                    System.out.println("--> ["
                                            + new java.util.Date(System.currentTimeMillis())
                                            + "] : " + s);

                                    // Echo back to client
                                    s = s.concat(":Test");
                                    //bos.write(b, 0, read);
                                    bos.write(s.getBytes());
                                    bos.flush();
                                } catch (Exception e) {
                                    readCount++;

                                    if (readCount > 10) {
                                        break;
                                    }
                                }
                                client.close();
                            } catch (IOException ex) {
                                Logger.getLogger(ChatServerThread.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(ChatServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
