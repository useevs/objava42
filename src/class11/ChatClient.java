/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shahzad
 */
public class ChatClient {

    public static void main(String[] args) {
        try {
            // 1. Client Setup - Connect
            Socket server = new Socket("127.0.0.1", 6666);
            System.out.println("Connection Established: " + server);

            // 2. Output Stream - Building
            BufferedOutputStream bos
                    = new BufferedOutputStream(
                            server.getOutputStream());
            BufferedInputStream bis
                    = new BufferedInputStream(
                            server.getInputStream());

            BufferedInputStream keyboard
                    = new BufferedInputStream(
                            System.in);

            // 3. Write data to output stream
            byte[] key = new byte[1024];
            while (true) {
                // 3.1 Read from Keyboard
                System.out.print("Input >>");
                int read = keyboard.read(key);

                // 3.2 Write to Server 
                bos.write(key, 0, read);
                bos.flush();

                // 3.3 Read from Server
                read = bis.read(key);
                System.out.print("Echo:"
                        + new String(key, 0, read));
            }
        } catch (IOException ex) {
            Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
