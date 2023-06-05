
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerProb {

    public static String checkInput() {
        String pattern = "\\d+";
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter a positive integer: ");
            String input = in.nextLine();
            if (input.isEmpty()) {
                System.err.println("Not empty!!!");
                continue;
            }
            if (!input.matches(pattern)) {
                System.err.println("Only number!!!");
                continue;
            }
            return input;
        }
    }

    public static void main(String[] args) {
        String numOne = checkInput();
        String numTwo = checkInput();
        BigInteger bigNumOne = new BigInteger(numOne);
        BigInteger bigNumTwo = new BigInteger(numTwo);
        System.out.println(bigNumOne.multiply(bigNumTwo));
    }
}