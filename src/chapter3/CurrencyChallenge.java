package chapter3;

import java.util.Scanner;

public class CurrencyChallenge {
    public static void main(String args[]){
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        double dollar = 1.00;
        int numberOfCoins;
        double totalMoney;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the 1 dollar game!");
        System.out.println("Lets begin..");


        System.out.println("Tell me how many pennies you have: ");
        numberOfCoins = input.nextInt();
        totalMoney = numberOfCoins * penny;

        System.out.println("Now, tell me how many nickels you got: ");
        numberOfCoins = input.nextInt();
        totalMoney = totalMoney + ( numberOfCoins * nickel ) ;

        System.out.println("How many dimes do you have now? ");
        numberOfCoins = input.nextInt();
        totalMoney = totalMoney + ( numberOfCoins * dime ) ;

        System.out.println("And finally, how many quarters do you possess?");
        numberOfCoins = input.nextInt();
        totalMoney = totalMoney + ( numberOfCoins * quarter ) ;


        input.close();


        System.out.printf("Your total change is %.2f! \n", totalMoney);
        System.out.println(9 != 0 || 5>5);


        if (totalMoney < 1) {
            System.out.printf("Boomer! :( You were %.2f close to a dollar!", dollar-totalMoney);
        } else if (totalMoney >1){
            System.out.printf("Boomer! :( You were %.2f above a dollar!", totalMoney-dollar);
        } else {
            System.out.printf("Congrats! You won the game getting exactly one whole dollar!");
        }


    }
}
