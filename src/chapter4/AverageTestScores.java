package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String args[]){
        int numberOfStudents = 2;
        int numberOfTests = 4;
        Scanner input = new Scanner(System.in);



        for (int i = 0; i < numberOfStudents; i++){

            System.out.println("Let's see the scores for the student #" + (i+1));

            int total = 0;
            for (int j=0; j < numberOfTests; j++) {
                System.out.println("Inform the score for the test #"+ (j+1));
                int score = input.nextInt();
                total = total + score;
            }
            double average = total/numberOfTests;
            System.out.println("The average score of student #"+ (i+1)+ " is: "+ average );
        }
    }
}
