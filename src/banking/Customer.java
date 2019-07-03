package banking;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private  String firstName;
    private  String lastName;
    private List<Account> accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts=new ArrayList<Account>();
    }
    @Override
    public String toString() {
        return "Customer:"+firstName+","+lastName;
    }
    public void addAccount(Account account){
        accounts.add(account);
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Account getAccount(int index){
        return accounts.get(index);
    }
    public int getNumOfAccounts(){
        return accounts.size();
    }

}
