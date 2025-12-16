package oops_programs;

public class Stock {
    private String name;
    private int shares;
    private double price;

    public Stock(String name,int shares,double price){
        this.name=name;
        this.shares=shares;
        this.price=price;
    }

    public double value(){
        return shares*price;
    }

    public String getName(){
        return name;
    }
}

