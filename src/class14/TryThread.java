/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shahzad
 */
public class TryThread extends Thread {
    
    private String firstname;
    private String lastname;
    private Long delay;
    
    public TryThread(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public TryThread(String firstname, String lastname, Long delay) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.delay = delay;
        
        setName(firstname + "--" + lastname + "--" + delay);
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    @Override
    public void run() {
        while (true) {
            System.out.println(lastname);
            try {
                sleep(delay);
                yield();
            } catch (InterruptedException ex) {
                Logger.getLogger(TryThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(firstname);
        }
    }
    
    public static void main(String[] args) {
        Thread t1 = new TryThread("ahmed", "shahzad", 1000L);
        Thread t2 = new TryThread("sarfraz", "ahmed", 2000L);
        Thread t3 = new TryThread("muhammad", "sami", 3000L);
        
        try {
            t1.join(1000L);
        } catch (InterruptedException ex) {
            Logger.getLogger(TryThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t1.start();
        t2.start();
        t3.start();
    }
}
