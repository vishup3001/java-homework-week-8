import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Prog02MinAndMaxInputChallenge {
    // create main method
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);//taking input

        System.out.println("Enter numbers ");
        int n = sc.nextInt();
        int max = n;
        int min = n;
        //condition
        while (sc.hasNextInt()) {

            System.out.println("Enter numbers ");

            n = sc.nextInt();
            if (max < n)
                max = n;
            if (min > n)
                min = n;
        }
        System.out.println("Max value is : " + max);
        System.out.println("Min value is : " + min);
        // closing scanner
        sc.close();

    }

}




