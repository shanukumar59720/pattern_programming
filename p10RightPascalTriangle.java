/*
 * Right Pascal's Triangle
 * 
 *      *
 *      * *
 *      * * *
 *      * * * *
 *      * * * * *
 *      * * * *
 *      * * * 
 *      * *
 *      *
 */

public class p10RightPascalTriangle {
    public static void main(String[] args) {
        // upper triangle + lower triangle = right pascals triangle

        /*
         * upper right triangle 1 - 5
         */
        for (int i = 1; i <= 5; i++) {
            // printing stars
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         * lower right triangle
         */

         for (int i = 1; i <=4; i++) {
            // printing stars
            for (int j = 4; j >=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
         }

    }

}
