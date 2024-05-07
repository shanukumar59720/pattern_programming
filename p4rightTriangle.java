/*
 * right triangle
 * 
*   *
*   * *
*   * * *
*   * * * *
*   * * * * *
 */

import java.util.Scanner;

public class p4rightTriangle {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of right angled triangle: ");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
