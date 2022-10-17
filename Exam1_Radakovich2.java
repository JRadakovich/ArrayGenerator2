/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *  @author Julie Radakovich
 * CIT 130 - Exam 1
 */
public class Exam1_Radakovich2 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[] largeArray = loadArray(scan);
        int evenCount = countEven(largeArray);

        System.out.println("The array contains: " +Arrays.toString(largeArray));
        System.out.println(evenCount + " of these values are even numbers.");
    }
    public static double[] loadArray(Scanner sc){
        double[] arr = new double[5];
        
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter a number (Whole or decimal) to store in the array:");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    public static int countEven(double[] a) {
        int evenc = 0;
        for (double e : a) {
            if(e % 2 == 0) {
                evenc++;
            }
        }
        return evenc;
    }
}

