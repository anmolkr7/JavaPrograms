package oops_programs;

import java.util.HashMap;
import java.util.Map;

public class StockAccount extends Account {
    private Map<String,CompanyShares> holdings=new HashMap<>();

    public StockAccount(double balance){
        super(balance);
    }

    public double valueOf(){
        return balance;
    }

    public void buy(int amount,String symbol,double price){
        double cost=amount*price;
        if(cost>balance){
            System.out.println("Insufficient balance");
            return;
        }
        debit(cost);
        holdings.put(symbol,new CompanyShares(symbol,amount));
    }

    public void sell(int amount,String symbol,double price){
        CompanyShares cs=holdings.get(symbol);
        if(cs==null||cs.shares<amount){
            System.out.println("Not enough shares");
            return;
        }
        cs.shares-=amount;
        balance+=amount*price;
    }

    public void printReport(){
        System.out.println("Balance="+balance);
        for(CompanyShares cs:holdings.values())
            System.out.println(cs.symbol+" shares="+cs.shares+" at "+cs.time);
    }
}

