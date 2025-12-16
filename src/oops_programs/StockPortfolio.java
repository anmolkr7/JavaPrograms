package oops_programs;

import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {
    private List<Stock> stocks=new ArrayList<>();

    public void addStock(Stock stock){
        stocks.add(stock);
    }

    public double totalValue(){
        double sum=0;
        for(Stock s:stocks)
            sum+=s.value();
        return sum;
    }

    public void printReport(){
        for(Stock s:stocks)
            System.out.println(s.getName()+" value="+s.value());
        System.out.println("Total Portfolio Value="+totalValue());
    }
}

