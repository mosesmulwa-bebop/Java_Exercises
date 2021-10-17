/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1_forloops;

/**
 *
 * @author USER
 */
public class Task1_forloops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        staircase();

        System.out.println("");

     	repeating_numbers();

        System.out.println("");

        inc_dec_numbers();
        
        System.out.println("");
        
        zeros_and_ones();
    }
     public static void staircase(){
     	int height_staircase = 4;
     	String stair = "*";
     	String newstair ="";
         for(int i=1;i<=height_staircase;i++){
            newstair += stair;
            System.out.println(newstair);
			}
     }

     public static void repeating_numbers(){
     	int numbers = 4;
     	for(int i =1;i <= numbers; i++){
     		String num = Integer.toString(i);
     		String newnum = "";
     		for(int j = 1; j <= i; j++){
     			newnum += num;
     			
     		}
     		System.out.println(newnum);
     	}
     }

     public static void inc_dec_numbers(){
          int numbers = 4;
          for(int i=1; i<=numbers; i++){
               int center = i;
               String finalnum= "";
               //forward
               for(int j =1;j <= center;j++){
                    String num = Integer.toString(j);
                    finalnum += num;
               }
               //backward
               for(int h = center-1; h>= 1; h--){
                    String num = Integer.toString(h);
                    finalnum += num;
               }
               System.out.println(finalnum);
          } 
     }
     
     public static void zeros_and_ones(){
        int height = 4;
        int count = 1, num = 1;
        for (int i = 1; i <= height; i++) { 
            for (int k = 1; k <= num; k++) {
                System.out.print(count % 2);
                count++;
            }
            num += 2;
            System.out.print("\n");
        }
    }
}
