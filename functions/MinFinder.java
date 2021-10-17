/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MinFinder {
 
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double val1 = input.nextDouble();
        double val2 = input.nextDouble();
        double val3 = input.nextDouble();
        double minimum;
        minimum = val1;
        if (val2 < minimum) {
            minimum = val2;
        }
        if (val3 < minimum) {
            minimum = val3;
        }
        System.out.println("Minimum value is: " + minimum);

    } //end of MinFinderApp class
}
