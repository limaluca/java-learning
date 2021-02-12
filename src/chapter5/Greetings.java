package chapter5;

import java.util.Scanner;

public class Greetings {
    public static void main(String args[]){
        System.out.println("Tell me your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        greetUser(name);
    }

    public static void greetUser(String name){
        System.out.println("Hello, " + name + "!");
    }



}
