package logical_programs;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Press Enter to START the stopwatch");
        sc.nextLine();

        long startTime=System.currentTimeMillis();

        System.out.println("Press Enter to STOP the stopwatch");
        sc.nextLine();

        long endTime=System.currentTimeMillis();

        long elapsedTime=endTime-startTime;
        System.out.println("Elapsed Time (milliseconds): "+elapsedTime);
    }
}

