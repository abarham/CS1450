package Assignment_02;
import java.util.Scanner;
/**
 * Created by austin on 12/22/14.
 */
public class Main {
    public static void main(String args[]) {
        int count = 0;
        int x;
        int[] values = new int[250];

        Scanner scan = new Scanner(System.in);

        //read value
        x = scan.nextInt();

        while (x > 0) {
            //add x to array
            values[count] = x;

            //increment count
            count++;

            //read next input value
            x = scan.nextInt();

        }//while x > 0

        //output
        ArrayPrint(values, count);
        System.out.println("The max value is: " + ArrayMax(values, count));
        System.out.println("The min value is: " + ArrayMin(values, count));
        System.out.println("The count of the values is: " + count);
        System.out.println("The average of the values is: " + ArrayAvg(values, count));

    }//main

    //finds and returns maximum value contained in array
    public static int ArrayMax(int[] data, int count) {
        int max = 0;    // stores current max value

        if (count < 1) {
            return -1;
        }
        else {
            for (int i = 0; i < (count - 1); i++) {
                if (data[i] > max) {
                    max = data[i];
                }
            }
        }
        return max;
    }//ArrayMax

    //finds and returns minimum value contained in array
    public static int ArrayMin(int[] data, int count) {
        int min = 0;    // stores current min value

        if (count < 1) {
            return -1;
        }
        else {
            for (int i = 0; i < (count - 1); i++) {
                if (data[i] < min) {
                    min = data[i];
                }
            }
        }
        return min;
    }//ArrayMin

    //finds and returns sum of the values contained in array
    public static int ArraySum(int[] data, int count) {
        int sum = 0;    // stores current sum value

        if (count < 1) {
            return -1;
        }
        else {
            for (int i = 0; i < (count - 1); i++) {
               sum += data[i];
            }
        }
        return sum;
    }//ArraySum

    //computes the average of the array values using ArraySum
    public static double ArrayAvg(int[] data, int count) {
        if (count < 1) {
            return -1.0;
        }
        else {
            return (ArraySum(data, count) / count);
        }

    }//ArrayAvg

    //prints the index and value of each used array slot
    public static void ArrayPrint(int[] data, int count) {
        if (count < 1) {
            System.out.println("The array is empty.");
        }
        else {
            for (int i = 0; i < (count - 1); i++) {
                System.out.println("Index: " + i + "\tValue is: " + data[i]);
            }
        }

    }//ArrayPrint

}//Main
