package logical_programs;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Taking input from the user
        System.out.println("Enter the number to reverse");
        int n=sc.nextInt();

        // Calling the function to reverse the number
        System.out.println("Reversed Number is: "+reverseNumber(n));
    }

    // Function to reverse the digits of a number
    static int reverseNumber(int n)
    {
        int reverse=0,remainder;   // Stores the final reversed number and last digit

        // Continue until all digits are processed
        while(n!=0)
        {
            remainder=n%10;                    // Extract last digit
            reverse=(reverse*10)+remainder;    // Append it to reversed number
            n=n/10;                            // Remove last digit
        }
        return reverse; // Return the reversed number
    }
}
