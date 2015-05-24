/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.element.ExecutableElement;

/**
 *
 * @author shahzad
 */
public class TestBank {

    private static double initialBalance = 1000,
            credits = 0, debits;
    private static int totalCheques = 100;

    public static void main(String[] args) {

        Executor exec = Executors.newCachedThreadPool();
        Bank bank = new Bank();
        Account account = new Account(10078, initialBalance);

        // Operators
        Operator one = new Operator(bank);
        Operator two = new Operator(bank);
        exec.execute(one);
        exec.execute(two);

        // Deposit or withdraw amount
        Random rand = new Random();
        double amount = 0.0;
        Cheque check = null;
        for (int i = 0; i < totalCheques; i++) {
            // Credit
            amount = 100 + rand.nextInt(50);
            check = new Cheque(account, amount, ChequeType.CREDIT);
            one.doProcess(check);
            credits += amount;

            // Debit
            amount = 60 + rand.nextInt(80);
            check = new Cheque(account, amount, ChequeType.DEBIT);
            two.doProcess(check);
            debits += amount;
        }

        while (one.busy() || two.busy()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestBank.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("Initial Amount: " + initialBalance);
        System.out.println("Credits:" + credits);
        System.out.println("Debits: " + debits);
        System.out.println("Balance:" + account.getBalance());
        System.out.println("Actual Balance: " + (initialBalance + credits - debits));
    }
}
