/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2_reverse_number;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Task2_reverse_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int number = 0;
            int reverseNumber = 0;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter number: ");
            //Check if number inputted is an integer or not
            while (!input.hasNextInt()) {
                System.out.println("That's not an integer!");
                System.out.print("Re-enter the number: ");
                input.next();
            }
            number = input.nextInt();
            while (number != 0) {
                reverseNumber = reverseNumber * 10;
                reverseNumber = reverseNumber + number % 10;
                number = number / 10;
            }

            System.out.println("Reverse of input number is: " + reverseNumber);

        } catch (Exception e) {
            System.out.print("Something went wrong.");
        }
    }
    
}
