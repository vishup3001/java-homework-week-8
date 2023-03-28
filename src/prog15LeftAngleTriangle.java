/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class prog15LeftAngleTriangle {
    public static void main(String[] args) {


        //row is the number of rows you want to print
        int i, j, row = 5;
        //Outer loop
        for (i = 0; i < row; i++) {
            //inner loop
            for (j = 2 * (row - i); j >= 6; j--) {
                //prints space between two stars
                System.out.print(" ");
            }
            //inner loop1
            for (j = 0; j <= i; j++) {
                //print stars
                System.out.print("* ");
            }
            // newline after print each line
            System.out.println();

        }
    }

}



