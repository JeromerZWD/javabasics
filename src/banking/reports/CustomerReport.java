package banking.reports;

import banking.Bank;
import banking.CheckingAccount;
import banking.Customer;
import banking.SavingAccount;

public class CustomerReport  {
    Bank bank= Bank.getBanking();
    public void generate(){
        //8-1
       /* System.out.println("    CUSTOMER REPORT");
        System.out.println("=======================");
        int num=bank.getNumberOfCustomer();
        Customer customer;
        for (int i=0;i<num;i++) {
            customer = bank.getCustomer(i);
            int num2 = customer.getNumOfAccounts();
            System.out.println("Customer:" + customer.getLastName() + "," + customer.getFirstName());
            for (int j = 0; j < num2; j++) {
                if (customer.getAccount(j) instanceof SavingAccount)
                    System.out.println("Savings Account:current balance is $" + customer.getAccount(j).getBalance());
                if (customer.getAccount(j) instanceof CheckingAccount)
                    System.out.println("Checking Account:current balance is $" + customer.getAccount(j).getBalance());
            }
        }*/
        //8-2


    }

}
