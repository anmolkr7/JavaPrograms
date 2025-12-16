package oops_programs;

public class Main {
    public static void main(String[] args){

        StockPortfolio portfolio=new StockPortfolio();
        portfolio.addStock(new Stock("TCS",10,3500));
        portfolio.addStock(new Stock("INFY",5,1500));
        portfolio.printReport();

        StockAccount account=new StockAccount(100000);
        account.buy(10,"TCS",3500);
        account.sell(5,"TCS",3500);
        account.printReport();
    }
}
