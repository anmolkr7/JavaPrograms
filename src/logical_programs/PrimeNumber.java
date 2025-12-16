package logical_programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input from the user
        System.out.println("Enter the number to check");
        int n = sc.nextInt();

        //Calling the function to check
        boolean result = prime(n);

        //Displaying the output
        if(result)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is Not a Prime Number");
    }

    // Function to check if number is prime
    static boolean prime(int n)
    {
        // Prime numbers must be greater than 1
        if(n<=1) return false;
        // Check divisors from 2 to √n
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;   // If divisible → not prime
        }
        return true; // No divisor found → prime
    }
}
