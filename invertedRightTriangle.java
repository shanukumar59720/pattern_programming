import java.util.Scanner;

public class invertedRightTriangle {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of inverted right triangle: ");
        num = sc.nextInt();

        for(int i=num; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
