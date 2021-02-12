package chapter5;
import java.util.Scanner;

public class PhoneBillCalculator {
    static double overageCharge = 0.25;
    static double tax = 0.15;
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]){

        double plan = getPlanCost();
        int minutes = getOverageMinutes();
        input.close();
        double minutesFee = chargeMinutes(minutes);
        double taxes = chargeTax(plan,minutesFee);
        double total = getTotal(plan,minutesFee,taxes);
        getBill(plan,minutesFee,taxes,total);

    }

    public static double getPlanCost(){
        System.out.println("Please, inform the cost of  your plan");
        double cost = input.nextDouble();
        return cost;
    }

    public static int getOverageMinutes(){
        System.out.println("Now, inform the number of overage minutes: ");
        int minutes = input.nextInt();
        return minutes;
    }

    public static double chargeMinutes(int minutes){
        double fee = minutes * overageCharge;
        return fee;
    }

    public static double chargeTax(double planCost, double overageCharge){
        double fee = (planCost + overageCharge) * tax;
        return fee;
    }

    public static double getTotal(double planCost, double minutesCharge, double taxCharge){
        return planCost + minutesCharge + taxCharge;
    }

    public static void getBill(double planCost, double minutesCharge, double taxCharge, double total){
        System.out.println("Detailed phone bill");
        System.out.println("Plan cost: " + planCost);
        System.out.println("Overage cost: " + minutesCharge);
        System.out.printf("Taxes: %.2f\n",taxCharge);
        System.out.printf("Total: %.2f", total);

    }


}
