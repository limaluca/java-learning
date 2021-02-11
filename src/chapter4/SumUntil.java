package chapter4;

import java.util.Scanner;

public class SumUntil {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the sum program!");
        boolean again;


        do {
            System.out.println("Inform the first number to sum ");
            int firstNumber = input.nextInt();
            System.out.println("Inform the first number to sum ");
            int secondNumber = input.nextInt();
            int sum = firstNumber + secondNumber;
            System.out.println("The result of the sum is: " + sum);

            System.out.println("Would you like to do it again? Inform true of false.");
            again = input.nextBoolean();


        } while (again);




    }
}
