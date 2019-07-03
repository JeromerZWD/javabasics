package banking;


public class TestBanking {
    public static void main(String[] args) {
        //1
        /*Account a=new Account(500.00);
        a.withdraw(150.00);
        a.deposit(22.50);
        a.withdraw(47.62);
        a.getBalance();*/
        //2
       /* Customer c=new Customer("Jane","Smith");
        Account a=new Account(500.00);
        c.setAccount(a);
        a.withdraw(150.00);
        a.deposit(22.50);
        a.withdraw(47.62);
        c.getAccount().getBalance();*/
       //3
        /*Customer c=new Customer("Jane","Smith");
        Account a=new Account(500.00);
        c.setAccount(a);
        a.withdraw(150.00);
        a.deposit(22.50);
        a.withdraw(47.62);
        a.withdraw(400.00);
        c.getAccount().getBalance();*/
        //4
        /*Bank1 b=new Bank1();
        b.addCustomer("Simms","Jane");
        b.addCustomer("Bryant","Owen");
        b.addCustomer("Soley","Tim");
        b.addCustomer("Soley","Maria");
        b.getCustomer(0);
        b.getCustomer(1);
        b.getCustomer(2);
        b.getCustomer(3);*/
        //5
       /* Bank1 bank=new Bank1();
        Customer customer;
        Account account;

        System.out.println("Creating the customer Jane Smith.");
        System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest");
        bank.addCustomer("jane","Simms");
        customer=bank.getCustomer(0);
        account=new SavingAccount(500,0.03);
        customer.setAccount(account);

        System.out.println("Creating the customer Owen Bryant.");
        System.out.println("Creating his Checking Account with a 500.00 balance and no overdraft protection.");
        bank.addCustomer("Owen","Bryant");
        customer=bank.getCustomer(1);
        account=new CheckingAccount(500,0);
        customer.setAccount(account);

        System.out.println("Creating the customer Tim Soley.");
        System.out.println("Creating his Checking Account with a 500.00 balance and 500.00 in overdraft protection.");
        bank.addCustomer("Tim","Soley");
        customer=bank.getCustomer(2);
        account=new CheckingAccount(500,500);
        customer.setAccount(account);

        System.out.println("Creating the customer Maria  Soley.");
        System.out.println("Maria shares her Checking Account with her husband Tim.");
        bank.addCustomer("Maria ","Soley");
        customer=bank.getCustomer(3);
        customer.setAccount(bank.getCustomer(2).getAccount());
        System.out.println();
        System.out.println("Retrieving the customer Jane Smith with her savings account. ");
        customer=bank.getCustomer(0);
        account=customer.getAccount();
        account.withdraw(150.00);
        account.deposit(22.50);
        account.withdraw(47.62);
        account.withdraw(400.00);
        System.out.println("Customer ["+customer.getLastName()+","+customer.getFirstName()+"] has a balance of"+account.getBalance());
        System.out.println();

        System.out.println("Retrieving the customer Owen Bryant with his checking account with no overdraft protection.");
        customer=bank.getCustomer(1);
        account=customer.getAccount();
        account.withdraw(150.00);
        account.deposit(22.50);
        account.withdraw(47.62);
        account.withdraw(400.00);
        System.out.println("Customer ["+customer.getLastName()+","+customer.getFirstName()+"] has a balance of"+account.getBalance());
        System.out.println();

        System.out.println("Retrieving the customer Tim Soley with his checking account that has overdraft protection.");
        customer=bank.getCustomer(2);
        account=customer.getAccount();
        account.withdraw(150.00);
        account.deposit(22.50);
        account.withdraw(47.62);
        account.withdraw(400.00);
        System.out.println("Customer ["+customer.getLastName()+","+customer.getFirstName()+"] has a balance of"+account.getBalance());
        System.out.println();

        System.out.println("Retrieving the customer Maria Soley with her joint checking account with husband Tim.");
        customer=bank.getCustomer(3);
        account=customer.getAccount();
        account.deposit(150);
        account.withdraw(700);
        System.out.println("Customer ["+customer.getLastName()+","+customer.getFirstName()+"] has a balance of"+account.getBalance());
        System.out.println();*/

    }
}
