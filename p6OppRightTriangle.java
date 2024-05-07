/*
 * Opposite right triangle
 *  * * * * *
 *    * * * *
 *      * * *
 *        * * 
 *          *
 */

import java.util.Scanner;

public class p6OppRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        for (int i = num; i >=1; i--) {
            // printing spaces
            for (int j = 1; j <=num-i; j++) {
                System.out.print("  ");
            }

            // printing stars
            for (int k = 1; k <=i; k++) {
                System.out.print("* ");                
            }
            System.out.println();                       
        }
        sc.close();
    }    
}
