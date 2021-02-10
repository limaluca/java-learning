package chapter2;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        //Get the hours worked
        System.out.println("Enter the number of hours the employee worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //get the pay rate
        System.out.println("Enter the employee's pay rate: ");
        double rate = scanner.nextDouble();
        scanner.close();
        System.out.println(rate);

        //multiply the hours by the pay rate
        double grossPay = hours * rate;

        //display the result
        System.out.println("The employee's gross pay is: " + grossPay);




    }
}
