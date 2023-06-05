public class ChangeBase {
    public static int BtoD(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            int digit = binary.charAt(length - 1 - i) - '0';
            decimal += digit * power(i);
        }

        return decimal;
    }

    public static int power(int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= 2;
        }
        return result;
    }

    public static String BtoH(String binary) {
        String hexadecimal = "";
        int decimal = BtoD(binary);

        while (decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal = toHexDigit(remainder) + hexadecimal;
            decimal = decimal / 16;
        }

        return hexadecimal;
    }

    public static char toHexDigit(int digit) {
        if (digit >= 0 && digit <= 9) {
            return (char) (digit + '0');
        } else {
            return (char) (digit - 10 + 'A');
        }
    }

    public static String DtoB(int decimal) {

        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }

        return binary.toString();
    }

    public static String DtoH(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder hexadecimal = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal.insert(0, toHexDigit(remainder));
            decimal = decimal / 16;
        }

        return hexadecimal.toString();
    }

    public static String HtoB(String hexadecimal) {
        StringBuilder binary = new StringBuilder();
        int length = hexadecimal.length();

        for (int i = 0; i < length; i++) {
            char digit = hexadecimal.charAt(i);
            int decimal = digitToDecimal(digit);
            String binaryDigit = DtoB(decimal);
            binary.append(binaryDigit);
        }

        return binary.toString();
    }

    public static int digitToDecimal(char digit) {
        if (digit >= '0' && digit <= '9') {
            return digit - '0';
        } else if (digit >= 'A' && digit <= 'F') {
            return digit - 'A' + 10;
        } else if (digit >= 'a' && digit <= 'f') {
            return digit - 'a' + 10;
        } else {
            throw new IllegalArgumentException("Invalid hexadecimal digit: " + digit);
        }
    }

    public static int HtoD(String hexadecimal) {
        int decimal = 0;
        int length = hexadecimal.length();

        for (int i = 0; i < length; i++) {
            char digit = hexadecimal.charAt(i);
            int power = length - 1 - i;
            int value = digitToDecimal(digit);
            decimal += value * Math.pow(16, power);
        }

        return decimal;
    }

}
