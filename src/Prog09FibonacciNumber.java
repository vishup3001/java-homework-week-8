/**
 * . Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Prog09FibonacciNumber {

    public static void main(String[] args) {
//for 10 numbers
        int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        while (i <= n) {     //using while loop
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }
    }
}
