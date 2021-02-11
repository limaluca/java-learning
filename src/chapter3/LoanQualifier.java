package chapter3;

import java.util.Scanner;

//To qualify for a loan, a person must make at least $30,000 a year
// And the pearson have to be working at their current job for at least 2 years
public class LoanQualifier {
    public static void main(String args[]){
        //Iniciallize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;


        // Get what we dont know
        System.out.println("Enter your salary: ");
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();

        System.out.println("Enter how many years you're working: ");
        double years = input.nextDouble();
        input.close();


        // Conditions meeting

        if(salary >= requiredSalary && years>= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan.");

        } else {
            System.out.println("Sorry, you must earn at least " + requiredSalary + " to qualify for the loan.");
        }

    }
}
