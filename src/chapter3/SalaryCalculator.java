package chapter3;
import java.util.Scanner;

/*
    Payment a week = $1000
    Salespeople who sells more than 10 get bonus of $250
*/


public class SalaryCalculator {
    public static void main(String args[]){

        // Iniciallize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get unknown values
        System.out.println("How many sales did the employee make this week?");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();

        // The condition calculation

        if (sales>quota){
            salary = salary + bonus;
        }

        System.out.println("The employee's payment is: " + salary);





    }
}
