/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplication;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int num;
        int result;
        System.out.println("Enter number you would like multiplication table for: ");
        num = input.nextInt();
        
        for(int i = 1; i<= num; i++){
            result = i * num;
            System.out.printf("%d * %d = %d \n",i,num,result);
      
        }
        
    }
    
}
