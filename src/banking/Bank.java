package banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;
    private static Bank  Banking = null;
    private Bank() {
        this.customers=new ArrayList<Customer>();
    }
    public void addCustomer(String f, String l){
        customers.add(new Customer(f,l));
    }
    public static Bank getBanking(){
        if (Banking==null) {
            Banking = new Bank();
            return Banking;
        }else{
            return Banking;
        }
    }
    public int getNumberOfCustomer(){
        return customers.size();
    }
    public Customer  getCustomer(int index){
        return  customers.get(index);
    }
    public List<Customer> getCustomers(){

        return customers;
    }

}
