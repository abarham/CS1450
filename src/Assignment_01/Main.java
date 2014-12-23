package Assignment_01;
import java.util.Scanner;
/**
 * Created by austin on 12/22/14.
 */
public class Main {
    public static void main(String args[]) {
        final int SENTINEL = -999;  //sentinel value used as "EOF" for program
        int max = SENTINEL;         //stores maximum value encountered
        int min = SENTINEL;         //stores minimum value encountered
        int count = 0;              //incremented to count number of values entered
        int sum = 0;                //stores the sum of all values entered
        int x;                      //stores current value being provessed
        double average;             //stores sum / count

        Scanner scan = new Scanner(System.in);

        //read an input value
        x = scan.nextInt();

        while (x != SENTINEL) {
            //initialize max and min values
            if (count == 0) {
                max = x;
                min = x;
            }

            //check max
            if (x > max) {
                max = x;
            }

            //check min
            if (x < min) {
                min = x;
            }

            //increment count
            count++;

            //add value to sum
            sum += x;

            //read next input value
            x = scan.nextInt();

        }//while x != SENTINEL

        if (count == 0) {
            System.out.println("The max, min, count, and average of the values could not be calculated\n" +
                    "because the only value given was SENTINEL.");
        }
        else {
            //calculate average
            average = sum / count;

            System.out.print(
                    "The max value is: " + max + "\n" +
                    "The min value is: " + min + "\n" +
                    "The count of values is: " + count + "\n" +
                    "The average of values is: " + average);

        }

    }//main

}//Main
