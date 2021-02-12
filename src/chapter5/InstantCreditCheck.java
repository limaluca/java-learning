package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]){

        double salary = getSalary();
        int credit = getCreditScore();


        //Check if the user is qualified
        boolean qualified = isUserQualified(salary,credit);

        //Notify the user
        notifyUser(qualified);


    }

    public static double getSalary(){
        System.out.println("Inform your salary: ");
        double salary = input.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Inform your credit score: ");
        int credit = input.nextInt();
        return credit;
    }

    public static boolean isUserQualified(double salary, int credit){
        if (salary >= requiredSalary && credit >= requiredCreditScore){
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean qualify){
        if (qualify) {
            System.out.println("Congratualations! You qualify for the credit! ");
        } else {
            System.out.println("Sorry, you didn't qualify for the credit.");
        }
    }
}
