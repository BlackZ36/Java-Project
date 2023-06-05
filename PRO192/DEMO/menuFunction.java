import java.util.*;

public class menuFunction {
    // Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // ------------------------------------------- KHAI BAO BIEN
        int[] a;
        int[][] b;
        int[][] c;
        int i, j, k, n;
        String choice1;
        int choice2, choice3;
        int exit1, exit2, exit3;
        exit1 = exit2 = exit3 = 1;
        // ------------------------------------------- KHAI BAO BIEN

        // ------------------------------------------- KHAI BAO HAM
        Scanner sc = new Scanner(System.in);
        // ------------------------------------------- KHAI BAO HAM

        // ------------------------------------------- CODE
        System.out.println("-------------------------------- PROGRAM --------------------------------");
        System.out.println("- A. Enter array A and continue.");
        System.out.println("- B. Enter array B and continue.");
        System.out.println("- E. Quit.");
        System.out.println("--------------------------- ENTER CHOICE BELOW --------------------------");

        System.out.print("Enter choice: ");
        choice1 = sc.next();
        System.out.println("--------------------------------------");
        while (choice1.charAt(0) != 'A' && choice1.charAt(0) != 'B' && choice1.charAt(0) != 'E') {
            System.out.println("Your entered choice is invalid (UPPER CASE).");
            System.out.print("Please enter correct choice: ");
            choice1 = sc.next();
            System.out.println("--------------------------------------");
        }

        while (exit1 != 0) {
            switch (choice1.charAt(0)) {
                case 'A': {
                    System.out.println("----------------- SUBPROGRAM -----------------");
                    System.out.println("1. Enter array A.");
                    System.out.println("2. Sort the array.");
                    System.out.println("3. Max and Min of array.");
                    System.out.println("4. Even and odd number of array.");
                    System.out.println("5. Exit and back to main menu.");
                    System.out.println("----------------------------------------------");

                    System.out.print("Enter Choice(1-5): ");
                    choice2 = sc.nextInt();
                    while (choice2 < 1 && choice2 > 5) {
                        System.out.println("Your entered choice is invalid (1-5).");
                        System.out.print("Please enter correct choice: ");
                        choice2 = sc.nextInt();
                    }
                    while (exit2 != 0) {
                        switch (choice2) {
                            case 1:{
                                System.out.print("Enter size for array: ");
                                n = sc.nextInt();
                                a = new int[n];
                                for(i=0;i<n;i++){
                                    System.out.printf("enter value for a[%d]: ");
                                    a[i] = sc.nextInt();
                                }
                                break;
                            }
                            case 2:{
                                break;
                            }
                            case 3:{
                                break;
                            }
                            case 4:{
                                break;
                            }
                            case 5:{
                                break;
                            }
                        }
                        if (exit2 != 0) {
                            System.out.print("Enter Choice(1-5): ");
                            choice2 = sc.nextInt();
                            while (choice2 < 1 && choice2 > 5) {
                                System.out.println("Your entered choice is invalid (1-5).");
                                System.out.print("Please enter correct choice: ");
                                choice2 = sc.nextInt();
                            }
                        }
                    }

                    break;
                }
                case 'B': {
                    System.out.println("Case B.");
                    break;
                }
                case 'E': {
                    System.out.println("Exited");
                    System.out.println("-------------------------------- GOODBYE --------------------------------");
                    exit1 = 0;
                    break;
                }
            }
            if (exit1 != 0) {
                System.out.println("--------------------------------------");
                System.out.print("Enter choice: ");
                choice1 = sc.next();
                System.out.println("--------------------------------------");
                while (choice1.charAt(0) != 'A' && choice1.charAt(0) != 'B' && choice1.charAt(0) != 'E') {
                    System.out.println("Your entered choice is invalid (UPPER CASE).");
                    System.out.print("Please enter correct choice: ");
                    choice1 = sc.next();
                    System.out.println("--------------------------------------");
                }
            }
        }

        // ------------------------------------------- CODE
    }

}
