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
public class GCD {
    public static int getGCD(int a, int b) {
        while (a != 0 && b != 0) // until either one of them is 0
        {
            int c = b;
            b = a % b;
            a = c;
        }
        return a + b; // either one is 0, so return the non-zero value
    }
    public static void runGCD(){
              try {
            int firstNumber, secondNumber = 0;
           
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first Number: ");
            //Check if number inputted is an integer or not
            while (!input.hasNextInt()) {
                System.out.println("That's not a valid number!");
                System.out.print("Re-enter the first number: ");
                input.next();
            }
            firstNumber =  input.nextInt();
            
             System.out.print("Enter second Number: ");
            //Check if number inputted is an integer or not
            while (!input.hasNextInt()) {
                System.out.println("That's not a valid number!");
                System.out.print("Re-enter the second number: ");
                input.next();
            }
            secondNumber =  input.nextInt();
            System.out.println("The GCD is: " + getGCD(firstNumber,secondNumber ));

        } catch (Exception e) {
            System.out.print("Something went wrong.");
        }
    }
    public static void main(String[] args) {
        runGCD();
    }

}
