package Task3;

public class Account {
    private int id;
    private Customer2 customer2;
    private double balance = 0.0;

    public Account(int id, Customer2 customer2, double balance){
        this.id = id;
        this.customer2 = customer2;
        this.balance = balance;
    }
    public Account(int id,Customer2 customer2){
        this.id = id;
        this.customer2 = customer2;
    }

    public int getId() {
        return id;
    }

    public Customer2 getCustomer2() {
        return customer2;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Account deposit(double amount){
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount){
        if(this.balance>amount){
            balance -=amount;
        }else {
            System.out.println("Нехватает средств на вашем балансе");
            return this;
        }
        return this;
    }
}
