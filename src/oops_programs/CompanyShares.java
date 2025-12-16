package oops_programs;

import java.time.LocalDateTime;

public class CompanyShares {
    String symbol;
    int shares;
    LocalDateTime time;

    public CompanyShares(String symbol,int shares){
        this.symbol=symbol;
        this.shares=shares;
        this.time=LocalDateTime.now();
    }
}

