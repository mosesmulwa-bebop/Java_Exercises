/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ene212_0083_2017;
import java.util.Scanner;
/**
 *
 * @author Paul Moses Mulwa
 */
public class Months {
    public static void main(String[] args) {
        int month_num,selection;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month Number: ");
            
        month_num = input.nextInt();
        System.out.print("Choose control structure: 1:If statement 2:Switch: ");
        selection = input.nextInt();
        //IF statement
        if(selection == 1){
            if(month_num == 1){
                System.out.println("January");
            }
            if(month_num == 2){
                System.out.println("February");
            }
            if(month_num == 3){
                System.out.println("March");
            }
            if(month_num == 4){
                System.out.println("April");
            }
            if(month_num == 5){
                System.out.println("May");
            }
            if(month_num == 6){
                System.out.println("June");
            }
            if(month_num == 7){
                System.out.println("July");
            }
            if(month_num == 8){
                System.out.println("August");
            }
            if(month_num == 9){
                System.out.println("September");
            }
            if(month_num == 10){
                System.out.println("October");
            }
            if(month_num == 11){
                System.out.println("November");
            }
            if(month_num == 12){
                System.out.println("December");
            }
           
        }
        //SWITCH CASE
        else if(selection == 2){
            switch(month_num){
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Wrong Entry");
            
            }
        }
    }
}
