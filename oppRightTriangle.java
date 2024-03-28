import java.util.Scanner;

public class oppRightTriangle {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            // printing spaces
            for (int j = num - 1; j > 0; j--) {
                System.out.print(" ");
            }

            // printing stars
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    System.out.print("* ");
                }
            }

            // printing new line for each row
            System.out.println();
        }
        sc.close();
    }
}
