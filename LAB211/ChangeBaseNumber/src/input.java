import java.util.*;

public class input {

    private static final Scanner sc = new Scanner(System.in);

    
    public static String inputBinary() {
        String input = "";

        while (true) {
            try {
                input = sc.next();
                if (!input.matches("[01]+")) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.print("---> invalid BINARY format - re-enter: ");
            }
        }
    }

    public static String inputDecimal() {
        String input = "";

        while (true) {
            try {
                input = sc.next();
                if (!input.matches("[0-9]+")) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.print("---> invalid DECIMAL format - re-enter: ");
            }
        }
    }

    public static String inputHexadecimal() {
        String input = "";

        while (true) {
            try {
                input = sc.next();
                if (!input.matches("[a-fA-F0-9]+")) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.print("---> invalid HEXADECIMAL format - re-enter: ");
            }
        }
    }

}
