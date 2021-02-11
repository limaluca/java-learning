package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]){
        // Inicialize known values
        int quota = 10;

        // Get unknown values
        System.out.println("Enter the number of sales you made this week: ");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        input.close();


        //Make decisions on the path to take
        if (sales >= quota)
            System.out.println("Congrats! You have met the quota!");
        else {
            int salesResume = quota - sales;
            System.out.printf("Oh! Seems like you did not met the quota. You were " + salesResume + " sales short!");
        }

        }
}
