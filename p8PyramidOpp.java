/*
 * Opposite pyramid
 * 
 *    * * * * *
 *     * * * *
 *      * * *
 *       * * 
 *        *
 */

public class p8PyramidOpp {
    public static void main(String[] args) {
        for(int i = 5; i>=1; i--){
            // printing spaces
            for (int j = 1; j<=5-i; j++) {
                System.out.print(" ");
            }

            // printing stars
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
