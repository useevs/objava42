/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

/**
 *
 * @author shahzad
 */
public class Cheque {

    private Account account;
    private Double amount;
    private ChequeType type;

    public Cheque(Account account, Double amount, ChequeType type) {
        this.account = account;
        this.amount = amount;
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public ChequeType getType() {
        return type;
    }

    public void setType(ChequeType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cheque{" + "account=" + account + ", amount=" + amount + ", type=" + type + '}';
    }
}
