/*
package banking.reports;

import banking.*;

public class TsetBanking2 {
    public static void main(String[] args) {
        Bank1 b=Bank1.getBanking();
        CustomerReport customerReport=new CustomerReport();
        Customer customer;
        b.addCustomer("jane","simms");
        customer=b.getCustomer(0);
        customer.setSavingAccount(new SavingAccount(500.00,0.05));
        customer.setCheckingAccount(new CheckingAccount(200.00,400.00));
        b.addCustomer("owen","Bryant");
        customer=b.getCustomer(1);
        customer.setCheckingAccount(new CheckingAccount(200.00,0));
        b.addCustomer("Tim","Soley");
        customer=b.getCustomer(2);
        customer.setSavingAccount(new SavingAccount(1500.00,0.05));
        customer.setCheckingAccount(new CheckingAccount(200.00,0));
        b.addCustomer("Maria","Soley");
        customer=b.getCustomer(3);
        customer.setCheckingAccount(new CheckingAccount(150.00,0));
        customer.setSavingAccount(new SavingAccount(200.00,0.05));
        customerReport.generate();
    }
}
*/
