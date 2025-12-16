package logical_programs;

import java.util.Scanner;

public class CouponNumbers {

    //Generates random number between 0 and n-1
    static int getRandom(int n){
        return (int)(Math.random()*n);
    }

    //Processes distinct coupons
    static int collectCoupons(int n){
        boolean[] collected=new boolean[n];
        int count=0;
        int distinct=0;

        while(distinct<n){
            int coupon=getRandom(n);
            count++;

            if(!collected[coupon]){
                collected[coupon]=true;
                distinct++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of distinct coupons: ");
        int n=sc.nextInt();

        int result=collectCoupons(n);
        System.out.println("Total random numbers needed: "+result);
    }
}

