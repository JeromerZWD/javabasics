package banking;

import banking.domain.OverdratException;

public class CheckingAccount extends Account{
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }
    public  CheckingAccount(double balance,double pretect){
        super(balance);
        this.overdraftProtection=pretect;
    }

    public void withdraw(double amt) throws OverdratException {
        if (amt<=super.getBalance()){
            super.setBalance(super.getBalance()-amt);
            System.out.println("Withdraw" + amt);
            /*System.out.println(":true");*/

        }else{
            if (this.overdraftProtection==0){
                System.out.println("Withdraw" + amt);
                throw new OverdratException("Insufficient funds for overdraft protection",(amt-balance));
            }
            double val=amt-super.getBalance();
            if (val<=this.overdraftProtection){
                super.setBalance(0);
                this.overdraftProtection-=val;
                System.out.println("Withdraw" + amt);
              /*  System.out.println(":true");*/
            }else{
                System.out.print("Withdraw" + amt);
                throw new OverdratException("Insufficient funds for overdraft protection",(val));
               // System.out.println(":false");*/
            }
        }
    }

}
