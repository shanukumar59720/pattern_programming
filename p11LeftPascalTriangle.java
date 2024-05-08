/*
 * Left pascal triangle
 * 
 *              *
 *            * *
 *          * * *
 *        * * * *
 *      * * * * *
 *        * * * *
 *          * * *
 *            * *
 *              *
 *  
 */

public class p11LeftPascalTriangle {

    public static void main(String[] args) {
        // upper left triangle + lower left triangle

        /*
         * upper left triangle
         */

        for (int i = 1; i <= 5; i++) {
            // printing spaces
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }

            // printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        /*
         * lower left triangle
         */

        for (int i = 4; i >= 1; i--) {
            // printing spaces
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }

            // printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}