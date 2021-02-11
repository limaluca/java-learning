package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double total=0;

        System.out.println("Inform the number of items you will take: ");
        int itemsNumber = input.nextInt();

        for (int i = 0; i < itemsNumber; i++){
            System.out.println("Inform cost of the item: ");
            double item = input.nextDouble();

            total = total + item;

        }

        System.out.println("The total cost is: $" + total);

    }
}
