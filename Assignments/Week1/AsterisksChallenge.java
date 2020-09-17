package Assignments.Week1;
import java.util.Scanner;

public class AsterisksChallenge {
    public static void main(String[] args) {
        int count;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input an integer: ");
        count = input.nextInt();
        // System.out.println(count);

        System.out.println();

        /*
        * Square. If the user inputs “5” print a five by five square instead of five asterisks
        *    
        *   * * * * *
        *   * * * * *
        *   * * * * *
        *   * * * * *
        *   * * * * * 
        *
        */
        // for (int i = 0; i < count; i++) {
        //     for(int j = 0; j < count; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //}

        /*
        * Left triangle. If the user inputs “4” print a triangle with a height of 4
        *
        *   *
        *   * *
        *   * * *
        *   * * * *
        *
        */
        
        // for (int i = 0; i < count; i++) {
        //     for (int j = 0; j < (i + 1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        /*
        * Right Triangle. If the user input “6” print a right justified triangle with a height of 6
        *
        *         *
        *       * *
        *     * * *
        *   * * * *
        *  * * * * *
        * * * * * * * 
        *
        */

        // for (int i = 0; i < count; i++) {
        //     for (int j = 0; j < count; j++) {
        //         if ((count  - (i+1)) > j) {
        //             System.out.print(" ");
        //         } else {
        //             System.out.print ("*");
        //         }
        //     }
        //     System.out.println();
        // }

        /*
        * Picture Frame. If the user input “6” print  the boarder around a square of size 6

        * * * * * * *
        * *         *
        * *         *
        * *         *
        * *         *
        * * * * * * * 
        */
        
        // for (int i = 0; i < count; i++) {
        //     for (int j = 0; j < count; j++) {
        //         if (i == 0 || i == count - 1) {
        //             for (int k = 0; k < count; k++) {
        //                 System.out.print("*");
        //             } 
        //             break;
        //         } else {
        //             if (j == 0 || j == count-1) {
        //                 System.out.print("*");
        //             } else {
        //                 System.out.print(" ");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }

        /*
        * Checkerboard. Print a checkerboarded square with the height and width of the input. (This height 7)
        *
        * *   *   *   *
        *   *   *   *
        * *   *   *   *
        *   *   *   *
        * *   *   *   *  
        *   *   *   *    
        * *   *   *   *
        *
        */

        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < count; j++) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = 0; j < count; j++) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }

    }
}
