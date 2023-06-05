import java.util.*;

public class CalcProgram {

    private static Scanner sc = new Scanner(System.in);

    public static int menu() {

        int choice = 0;
        boolean check = true;
        System.out.println("");
        System.out.println("===== Calculator Program =====");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");

        while (check) {
            try {
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                if (choice < 0 || choice > 3) {
                    throw new Exception();
                }
                check = false;
            } catch (Exception e) {
                System.out.println("Invalid Choice");
                sc.nextLine();
            }
        }

        return choice;
    }

    public static void menu2() {
        float w = 0, h = 0;
        boolean check = true;
        System.out.println("----- BMI Calculator -----");
        while (check) {
            try {
                System.out.print("Enter Weight(kg): ");
                w = sc.nextFloat();
                check = false;
            } catch (Exception e) {
                System.out.println("BMI is digit.");
                sc.nextLine();
            }
        }
        check = true;
        while (check) {
            try {
                System.out.print("Enter Height(cm): ");
                h = sc.nextFloat();
                h = h / 100;
                check = false;
            } catch (Exception e) {
                System.out.println("BMI is digit.");
                sc.nextLine();
            }
        }

        float BMI = (float) w / (float) (h * h);
        System.out.println("BMI number: " + BMI);
        if (BMI < 19) {
            System.out.println("BMI Status: Under-standard");
        } else if (BMI > 19 && BMI < 25) {
            System.out.println("BMI Status: Standard");
        } else if (BMI > 25 && BMI < 30) {
            System.out.println("BMI Status: Fat - should lose weight");
        } else if (BMI > 30) {
            System.out.println("BMI Status: Very fat");
        }

    }

    public static double inputValue() {
        double number = 0;
        while (true) {
            try {
                System.out.print("Enter number: ");
                number = sc.nextDouble();
                return number;
            } catch (Exception e) {
                System.out.print("INVALID Number - Re-");
                sc.nextLine();
            }
        }
    }

    public static String inputOperator() {
        String operator = "";
        while (true) {
            try {
                System.out.print("Enter operator: ");
                operator = sc.next();

                if (!operator.matches("[+\\-*/^=]")) {
                    throw new Exception();
                }

                return operator;
            } catch (Exception e) {
                System.out.println("Operator must be + - ^ / ^.");
                sc.nextLine();
            }
        }
    }

    public static double result(double number, String operator, double memory) {

        double result=0;


        if (operator.equals("+")) {
            result = memory + number;
        } else if (operator.equals("-")) {
            result = memory - number;
        } else if (operator.equals("*")) {
            result = memory * number;
        } else if (operator.equals("/")) {
            result = memory / number;
        } else if (operator.equals("^")) {
            result = Math.pow(memory, number);
        }

        return result;
    }

    public static void menu1() {
        String operator = "";
        double number = 0, memory = 0;
        boolean check = true;

        System.out.println("----- Normal Calculator -----");

        number = inputValue();
        memory = number;

        while (check) {
            try {
                operator = inputOperator();
                if (operator.equals("=")) {
                    System.out.println("result: " + memory);
                    check = false;
                } else {
                    number = inputValue();
                    memory = result(number, operator,memory);
                    System.out.println("memory: " + memory);
                }

            } catch (Exception e) {
                System.out.println("error");
            }
        }

    }

    public static void switchMenu() {

        boolean menuCheck;

        menuCheck = true;
        while (menuCheck) {

            int choice = menu();

            switch (choice) {
                case 1: {
                    menu1();
                    break;
                }
                case 2: {
                    System.out.println("Menu 2");
                    menu2();
                    break;
                }
                case 3: {
                    System.out.println("Exited.");
                    menuCheck = false;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        switchMenu();
    }
}
