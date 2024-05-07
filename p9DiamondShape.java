/*
 * Diamond Shape
 *       *
 *      * * 
 *     * * * 
 *    * * * *
 *   * * * * *
 *    * * * *
 *     * * *
 *      * *
 *       *
 */

public class p9DiamondShape {
    public static void main(String[] args) {
        // upper pyramid + lower pyramid = diamond shape

        /*
         * Lower Pyramid 1 - 5
         */

        for (int i = 1; i <= 5; i++) {
            // printing spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // printing stars
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         * Lower Pyramid 4 - 1
         */
        for (int i = 4; i >= 1; i--) {
            // printing spaces
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }

            // printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
