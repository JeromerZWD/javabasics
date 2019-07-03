/*
package banking.domain;

import banking.Bank1;
import banking.CheckingAccount;
import banking.Customer;

public class TestBanking3 {
    public static void main(String[] args) {
        Bank1 b=Bank1.getBanking();
        Customer customer;
        b.addCustomer("Jane","simms");
        customer=b.getCustomer(0);
        customer.setCheckingAccount(new CheckingAccount(200,500));
        System.out.println("Customer [simms,Jane]has a checking balance of 200.0 with a 500.0 overdraft protection");
       try {
           customer.getCheckingAccount().withdraw(150.00);
           customer.getCheckingAccount().deposit(22.50);
           customer.getCheckingAccount().withdraw(147.62);
           customer.getCheckingAccount().withdraw(470.00);
           System.out.println();

       }catch (OverdratException e1){
           System.out.println("Exception:"+e1.getMessage()+"Deficit:"+e1.getDeficit());
       }
        System.out.println("Customer [Simms,Jane]has a checking balance of 0.0");

        b.addCustomer("Owen","Bryant");
        customer=b.getCustomer(1);
        customer.setCheckingAccount(new CheckingAccount(200,0));
        System.out.println("Customer [Bryant,Owen]has a checking balance of 200.0");
        try {
            customer.getCheckingAccount().withdraw(100.00);
            customer.getCheckingAccount().deposit(25.00);
            customer.getCheckingAccount().withdraw(175.00);
            System.out.println();

        }catch (OverdratException e1){
            System.out.println("Exception:"+e1.getMessage()+"Deficit:"+e1.getDeficit());
        }
        System.out.println("Customer [Bryant,Owen]has a checking balance of 125.0");



    }
}
*/
