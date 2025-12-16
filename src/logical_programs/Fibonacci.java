package logical_programs;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //n=how many fibonacci numbers to print
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of fibonacci required:");
        n=sc.nextInt();

        // Loop to print Fibonacci series up to n terms
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
    // Recursive function to return nth Fibonacci number
    static int fibo(int n)
    {
        // Base cases: fib(0)=0, fib(1)=1
        if(n==0 || n==1)
            return n;
        // Recursive formula: fib(n)=fib(n-1)+fib(n-2)
        return fibo(n-1)+fibo(n-2);
    }
}
