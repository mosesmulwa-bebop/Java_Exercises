/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculations;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Average {
    public static void main(String[] args) {
        try{
            int first_integer, second_integer, third_integer, sum;
            
            float average;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the first integer: ");
            //Check if number inputted is an integer or not
            while (!input.hasNextInt()) {
                System.out.println("That's not an integer!");
                System.out.print("Re-enter the first integer: ");
                input.next(); 
            }
            first_integer = input.nextInt();
            
            System.out.print("Enter the second integer: ");
            //Check if number inputted is an integer or not
            while (!input.hasNextInt()) {
                System.out.println("That's not an integer!");
                System.out.print("Re-enter the second integer: ");
                input.next(); 
            }
            second_integer = input.nextInt();
            
            System.out.print("Enter the third integer: ");
            //Check if number inputted is an integer or not
            while (!input.hasNextInt()) {
                System.out.println("That's not an integer!");
                System.out.print("Re-enter the second integer: ");
                input.next(); 
            }
            third_integer = input.nextInt();
            sum = first_integer + second_integer + third_integer;
           
            //Casting types
            average = (float) sum / (float) 3;

            System.out.printf("The average is: %f\n", average);
            
        }
        catch(Exception e) {
             System.out.print("Something went wrong.");
        }
      
    }
}
