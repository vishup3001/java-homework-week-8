/**
 * 4. Write a program in Java to display the pattern like a diamond.
 *  While loop
 *  *
 *  ***
 *  *****
 *  *******
 *  *********
 * ***********
 * *************
 * ***********
 *  *********
 *  *******
 *  *****
 *  ***
 *  *
 */
public class Prog14Diamond {
    public static void main(String[] args) {

        // Declaring and initializing variables

        int number = 7;

        // Diamond starting with single star in first row
        int m = 1;

        // Columnar printing
        int n;

        // Outer loop 1
        // Prints the first half diamond


        // number of rows initialized
        while (m <= number) {
            n = 1;

            // Inner loop 1

            while (n++ <= number - m) {
                System.out.print(" ");
            }

            n = 1;

            // Inner loop 2

            while (n++ <= m * 2 - 1) {

                System.out.print("*");
            }

            System.out.println();

            // Incrementing
            m++;
        }

        m = number - 1;

        // Outer loop 2
        // Prints the second half diamond
        while (m > 0) {
            n = 1;

            // Inner loop 1

            while (n++ <= number - m) {

                System.out.print(" ");
            }

            n = 1;

            // Inner loop 2

            while (n++ <= m * 2 - 1) {

                System.out.print("*");
            }

            System.out.println();

            // Decrementing as we want reverse pyramid
            m--;
        }
    }
}

