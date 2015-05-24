/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

/**
 *
 * @author shahzad
 */
public class Account {

    private Integer acNumber;
    private Double balance;

    public Account(Integer acNumber, Double balance) {
        this.acNumber = acNumber;
        this.balance = balance;
    }

    public Integer getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(Integer acNumber) {
        this.acNumber = acNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "acNumber=" + acNumber + ", balance=" + balance + '}';
    }
}
