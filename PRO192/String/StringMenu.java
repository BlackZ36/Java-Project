package String;

import java.util.Scanner;

public class StringMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.print("\n-------------------- MENU --------------------\n");
            System.out.println("1. Find length of string");
            System.out.println("2. Check if string is palindrome");
            System.out.println("3. Concatenate two strings");
            System.out.println("4. Exit");
            System.out.print("----------------------------------------------\n\n");
            System.out.print("Enter your choice: ");
            int choice = 0;
            try {
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter a string: ");
                        String str = sc.nextLine();
                        System.out.println("Length of the string: " + str.length());
                        break;
                    case 2:
                        System.out.print("Enter a string: ");
                        String original = sc.nextLine();
                        String reverse = "";
                        for (int i = original.length() - 1; i >= 0; i--) {
                            reverse = reverse + original.charAt(i);
                        }
                        if (original.equals(reverse)) {
                            System.out.println("The string is a palindrome.");
                        } else {
                            System.out.println("The string is not a palindrome.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter the first string: ");
                        String str1 = sc.nextLine();
                        System.out.print("Enter the second string: ");
                        String str2 = sc.nextLine();
                        System.out.println("Concatenated string: " + str1 + str2);
                        break;
                    case 4:
                        run = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.  <-----------------");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Try again. <-------------------");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
