/**
 * pattern-
 * 
 *  * * * * *
 *  *       *
 *  * * * * *
 *  *       *
 *  *       *
 * 
 */
public class pattern {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == 0 || i == (size / 2) || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}