package logical_programs;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // Taking number from user
        System.out.println("Enter the number to check");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // Calling function to check perfect number
        boolean result=perfect(n);

        // Displaying output
        if(result)
            System.out.println(n+" is a perfect number");
        else
            System.out.println(n+" is not a perfect number");
    }

    // Function to check whether a number is perfect
    static boolean perfect(int n){
        int sum=0;
        // Find all divisors from 1 to n/2 (no divisor will be greater than n/2)
        for(int i=1;i<=n/2;i++)
        {
            // If i divides n, add it to sum
            if(n%i==0)
                sum=sum+i;
        }
        // Perfect number = sum of proper divisors equals the number
        return sum==n;
    }
}
