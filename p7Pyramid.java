/*
 * Pyramid
 * 
 *         *
 *        * *
 *       * * *
 *      * * * *
 *     * * * * *
 */
public class p7Pyramid {
    public static void main(String[] args) {
        for(int i = 5; i>=1; i--){ // 5,4,3,2,1

            // printing spaces
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }

            // printing stars
            for (int j = i; j <=5; j++) {
                System.out.print("* ");                
            }
            System.out.println();
        }
    }
}
