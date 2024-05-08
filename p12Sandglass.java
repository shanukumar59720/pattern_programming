/*
 * Sandglass
 * 
 *      * * * * *
 *       * * * *
 *        * * *
 *         * * 
 *          *
 *         * *
 *        * * *
 *       * * * *
 *      * * * * *
 */

public class p12Sandglass {
    public static void main(String[] args) {
        // Upper Pyramid + Lower Pyramid = Sandglass

        /*
         * Upper Pyramid
         */
        for (int i = 1; i <=5; i++) {
            // printing spaces
            for (int j = 1; j <=i-1; j++) {
                System.out.print(" ");
            }

            // printing stars
            for (int j = 5; j >=i; j--) {
                System.out.print("* ");
                
            }
            System.out.println();
        }

        /*
         * Lower pyramid
         */
        for (int i = 1; i <=4; i++) {
            // printing spaces
            for (int j = 3; j >=i; j--) {
                System.out.print(" ");
            }

            // printing stars
            for (int j = 1; j <=i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
