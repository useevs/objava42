/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

/**
 *
 * @author shahzad
 */
public class Bank {

    public void doProcess(Cheque cheque) {
        System.out.println(cheque);
//        double balance = cheque.getAccount().getBalance();
        switch (cheque.getType()) {
            case CREDIT:
                synchronized (cheque.getAccount()) {
                    cheque.getAccount().setBalance(
                            cheque.getAccount().getBalance()
                            + cheque.getAmount());
                }
                break;
            case DEBIT:
                synchronized (cheque.getAccount()) {
                    cheque.getAccount().setBalance(
                            cheque.getAccount().getBalance()
                            - cheque.getAmount());
                }
//                balance -= cheque.getAmount();
                break;
            default:
                System.out.println("We don't know this type ... ");
                break;
        }
//        cheque.getAccount().setBalance(balance);
    }
}
