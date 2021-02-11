package chapter4;

import java.util.Random;

public class TwentySpacesGame {
    public static void main(String args[]){
        Random random = new Random();
        int spaces = 20;
        int maxRolls = 5;
        System.out.println("Welcome to the Roll The Die Game!");

        int currentSpace = 0;
        for (int i = 0; i < maxRolls; i++){
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            if(currentSpace > 20){
                System.out.println("Oh, looks like somebody lost! You've got a "+ die +" Instead of a "+ ((spaces - currentSpace)+die) +". More luck next time ;)");
                break;
            }

            System.out.println("Roll #" + (i+1) + ": You've got a " + die + ". You are now on space " + currentSpace + ". and have " + (spaces - currentSpace) + " more to go." );
            if (currentSpace < 20 && i == 4) {
                System.out.println("Oh, you couldn't get to 20! More luck next time ;)");

            } else if (currentSpace ==20){
                System.out.println("Congrats! You've won!");
            }
        }





    }
}
