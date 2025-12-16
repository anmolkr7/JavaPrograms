package oops_programs;

public class Account {
    protected double balance;

    public Account(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void debit(double amount){
        if(amount>balance){
            System.out.println("Debit amount exceeded account balance");
            return;
        }
        balance-=amount;
    }
}
