/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ene212_0083_2017;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Sum_Average {
    public static void main(String[] args) {
        try{
            //initializing and declaring variables
            float first_num, second_num, third_num, sum;
            
            float average;
            //creating a new scanner 
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the first Number: ");
            //getting floating point inputs
            first_num = input.nextFloat();
            
            System.out.print("Enter the second Number: ");
            
            second_num = input.nextFloat();
            
            System.out.print("Enter the third Number: ");
           
            third_num = input.nextFloat();
            sum = first_num + second_num + third_num;
           
            //Casting types
            average =  sum / (float) 3;
            //The output
            System.out.printf("The sum is: %f\n",sum);
            System.out.printf("The average is: %f\n", average);
            
        }
        catch(Exception e) {
             System.out.print("Something went wrong.");
        }
    }
}
