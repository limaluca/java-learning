package chapter4;

import java.util.Scanner;

public class FindTheA {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        boolean foundIt = false;

        System.out.println("Say something: ");
        String phrase  = input.next();


        for (int i = 0; i < phrase.length(); i++){
            char currentLetter = phrase.charAt(i);
            if (currentLetter == 'a' || currentLetter == 'A') {
                foundIt = true;
                break;
            }

        }
        if (foundIt){
            System.out.println("a-HA! I've found the A!");
        }else{
            System.out.print("Oh, looks like there is no letter A on your phrase!");
        }
    }
}
