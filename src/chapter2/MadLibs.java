package chapter2;
import java.util.Scanner;


public class MadLibs {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me a season of the year. ");
        String season = input.next();



        System.out.println(season);
        System.out.println("Now tell me a whole number. ");
        int number = input.nextInt();

        System.out.println("and tell me an adjective. ");
        String adjective = input.next();

        input.close();



        System.out.printf("On a " + adjective +" "+ season + " day, I drink a minimum of " + number + " cups of coffe.");


    }
}
