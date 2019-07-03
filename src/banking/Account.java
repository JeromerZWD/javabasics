package banking;


import banking.domain.OverdratException;

public class Account {
    protected double balance;

    public Account() { }

    public Account(double init_balance) {
        this.balance = init_balance;
    }
    public double getBalance() {
    return balance;
    }
    public Boolean deposit(double amt) {
        balance+=amt;
        System.out.println("Deposit"+amt);
       // System.out.println(":true");
        return true;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amt) throws OverdratException
    {
        if (amt<=this.balance) {
            balance -= amt;
            System.out.print("Withdraw" + amt);
            System.out.println(":true");
        }else{
            throw new OverdratException("资金不足，缺少金额：",(amt-balance));
            /*System.out.print("Withdraw" + amt);
            System.out.println(":false");*/
        }
    }
}
