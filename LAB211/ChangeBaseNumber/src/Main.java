import java.util.*;

public class Main {

    public static int choice() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
        System.out.println("4. Exit");

        while (true) {
            try {
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                if (choice < 1 || choice > 4) {
                    throw new Exception();
                }
                return choice;
            } catch (Exception e) {
                System.out.print("---> INVALID choice. Re-");
                sc.nextLine();
            }
        }

    }

    public static void menu() {
        boolean menu = true;

        while (menu) {
            int choice = choice();

            switch (choice) {
                case 1: {
                    System.out.print("Enter Binary: ");
                    String binary = input.inputBinary();
                    System.out.println("=================");
                    System.out.println("Binary to Decimal: " + ChangeBase.BtoD(binary));
                    System.out.println("Binary to Hexadecimal: " + ChangeBase.BtoH(binary));
                    break;
                }
                case 2: {
                    System.out.print("Enter Decimal: ");
                    String dec = input.inputDecimal();
                    int decimal = Integer.parseInt(dec);
                    System.out.println("=================");
                    System.out.println("Decimal to Binary: " + ChangeBase.DtoB(decimal));
                    System.out.println("Decimal to Hexadecimal: " + ChangeBase.DtoH(decimal));
                    break;
                }
                case 3: {
                    System.out.print("Enter Hexadecimal: ");
                    String hexadecimal = input.inputHexadecimal();
                    System.out.println("=================");
                    System.out.println("Hexadecimal to Binary: " + ChangeBase.HtoB(hexadecimal));
                    System.out.println("Hexadecimal to Decimal: " + ChangeBase.HtoD(hexadecimal));
                    break;
                }
                case 4: {

                    System.out.println("Exited.");
                    menu = false;
                    break;
                }
            }
        }
    }


    public static void main(String[] args) throws Exception {
        menu();
    }
}
