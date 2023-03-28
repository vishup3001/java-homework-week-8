/**
 * . Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 */
public class Prog13hasSharedDigit {
    //main method
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }
    // declare static boolean

    public static boolean hasSharedDigit(int numA, int numB) {
        if ((numA < 10 || numA > 99) || (numB < 10 || numB > 99)) {
            return false;
        }
        int realNumB = numB;
        while (numA > 0) {
            int numADig = numA % 10;
            while (numB > 0) {
                int numBDig = numB % 10;
                if (numADig == numBDig) {
                    return true;
                }
                numB = numB / 10;
            }
            numA = numA / 10;
            numB = realNumB;
        }
        //declare return
        return false;
    }


}



