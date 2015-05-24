/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shahzad
 */
public class Operator implements Runnable {

    private Cheque tray = null;
    private Bank bank;

    public Operator(Bank bank) {
        this.bank = bank;
    }

    public boolean busy() {
        return tray != null;
    }

    public void doProcess(Cheque cheque) {
        while (tray != null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tray = cheque;
    }

    @Override
    public void run() {
        while (true) {
            while (tray == null) {
                try {
                    // WAIT 
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            bank.doProcess(tray);
            tray = null;
        }
    }
}
