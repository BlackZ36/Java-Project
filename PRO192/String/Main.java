package String;
import java.util.Scanner;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----- Main Menu -----");
            System.out.println("1. Count the number of words in a sentence");
            System.out.println("2. Another string function");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = 0;
            try {
                choice = sc.nextInt();
                sc.nextLine();
                if (choice < 1 || choice > 3) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                sc.nextLine();
                //continue;
            }
            if (choice == 3) {
                break;
            }
            switch (choice) {
                case 1:
                    countWordsInSentence(sc);
                    break;
                case 2:
                    anotherStringFunction(sc);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Exiting the program...");
    }
    
    private static void countWordsInSentence(Scanner sc) {
        System.out.print("Enter a sentence: ");
        String sentence = "";
        try {
            sentence = sc.nextLine();
            if (sentence.trim().length() == 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a sentence.");
        }
        String[] words = sentence.split("\\s+");
        System.out.println("The number of words in the sentence is: " + words.length);
    }
    
    private static void anotherStringFunction(Scanner sc) {
        // ... another string function implementation
    }
}

