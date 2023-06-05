//package demofile;

import java.util.*;

public class LAB1 {
    public static int removeDuplicateElements(double a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        double[] temp = new double[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a;
        double[][] b;
        double[][] bb;
        double[][] cong;
        double[][] nhan;
        int n, i, j, k;
        char choice;
        int choice1;
        choice = 'C';
        int exit = 1;
        int exit1 = 1;
        double temp;
        int count1, count2 = 0;
        count1 = 0;
        int choice2;
        int exit2 = 1;
        int c, c1, l, l1;

        // menu display
        System.out.println("------------------------ PROGRAM ------------------------");
        System.out.println("A. Enter Array A: ");
        System.out.println("B. Enter Matrix B: ");
        System.out.println("E. Exit.");
        System.out.println("---------------------------------------------------------");

        // enter choice
        System.out.print("Enter Choice: ");
        choice = sc.next().charAt(0);

        // check choice
        while ((choice != 'A') && (choice != 'B') && (choice != 'E')) {
            System.out.print("The Entered Choice Is Not Valid (UPPER CASE).\n");
            System.out.print("Please Re-Enter Choice: ");
            choice = sc.next().charAt(0);
        }
        System.out.println("---------------------------------------------------------");
        //
        while (exit != 0) {
            switch (choice) {
                case 'A': {
                    System.out.print("-----> Array A: ");
                    System.out.print("Enter size for array: ");
                    n = sc.nextInt();
                    a = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.printf("Enter element %d of A: ", i + 1);
                        a[i] = sc.nextDouble();
                    }
                    System.out.println("-----------------------------------------");
                    System.out.println("1.Sort the array in ascesding order. ");
                    System.out.println("2.MIN and MAX. ");
                    System.out.println("3.Delete duplicate element. ");
                    System.out.println("4.Count odd and even number. ");
                    System.out.println("5.Back to main menu. ");
                    System.out.println("-----------------------------------------");
                    // enter choice chuong trinh con
                    System.out.print("Enter choice (1-5): ");
                    choice1 = sc.nextInt();
                    // check choice1
                    while (choice1 <= 0 && choice1 >= 6) {
                        System.out.print("The Entered Choice Is Not Valid (1-5).\n");
                        System.out.print("Please Re-Enter Choice: ");
                        choice1 = sc.nextInt();
                    }
                    while (exit1 != 0) {
                        switch (choice1) {
                            case 1: {
                                for (i = 0; i < n; i++) {
                                    for (j = 0; j < n; j++) {
                                        if (a[i] < a[j]) {
                                            temp = a[i];
                                            a[i] = a[j];
                                            a[j] = temp;
                                        }
                                    }
                                }
                                System.out.print("Sorted Array in Asc order: " + Arrays.toString(a));
                                // for(i=0;i<n;i++){
                                // System.out.print(a[i]);
                                // }
                                break;
                            }
                            case 2: {
                                System.out.printf("Max = " + a[n - 1] + "\n");
                                System.out.printf("Min = " + a[0]);
                                break;
                            }
                            case 3: {
                                int length = a.length;
                                length = removeDuplicateElements(a, length);
                                for (i = 0; i < length; i++)
                                    System.out.print(a[i] + " ");
                                break;
                            }
                            case 4: {
                                for (i = 0; i < n; i++) {
                                    if (a[i] % 2 == 0) {
                                        count1++;
                                    } else
                                        count2++;
                                }
                                System.out.print("Even number: " + count1 + "\n");
                                System.out.print("Odd number: " + count2);
                                break;
                            }
                            case 5: {
                                System.out.println("Back To Main Menu.");
                                exit1 = 0;

                                System.out.println("---------------------------------------------------------");
                            }
                        }
                        if (exit1 == 1) {
                            System.out.println("\n-----------------------------------------");
                            System.out.print("Enter choice (1-5): ");
                            choice1 = sc.nextInt();

                            while (choice1 <= 0 && choice1 >= 6) {
                                System.out.print("The Entered Choice Is Not Valid (1-5).\n");
                                System.out.print("Please Re-Enter Choice: ");
                                choice1 = sc.nextInt();
                            }
                        }
                    }
                }
                case 'B': {
                    System.out.print("-----> Array B: \n");
                    System.out.print("Enter row for 1st B arrays: ");
                    c = sc.nextInt();
                    System.out.print("Enter column for 1st B arrays: ");
                    l = sc.nextInt();
                    System.out.print("--------\n");
                    System.out.print("Enter row for 2nd B arrays: ");
                    c1 = sc.nextInt();
                    System.out.print("Enter column for 2nd B arrays: ");
                    l1 = sc.nextInt();
                    b = new double[c][l];
                    bb = new double[c][l];

                    if (c == c1 && l == l1) {
                        System.out.println("Enter Value For matrix 1:");
                        for (i = 0; i < c; i++) {
                            for (j = 0; j < l; j++) {
                                System.out.printf("B1[%d][%d]: ", i, j);
                                b[i][j] = sc.nextDouble();
                            }
                        }
                        System.out.println("Enter Value For matrix 2:");
                        for (i = 0; i < c1; i++) {
                            for (j = 0; j < l1; j++) {
                                System.out.printf("B1[%d][%d]: ", i, j);
                                bb[i][j] = sc.nextDouble();
                            }
                        }
                    }

                    System.out.println("-----------------------------------------");
                    System.out.println("1.Addition of 2 arrays. ");
                    System.out.println("2.Multiplication of 2 arrays. ");
                    System.out.println("3.Back to main menu. ");
                    System.out.println("-----------------------------------------");
                    // enter choice chuong trinh con
                    System.out.print("Enter choice (1-3): ");
                    choice2 = sc.nextInt();
                    // check choice1
                    while (choice2 <= 0 && choice2 >= 4) {
                        System.out.print("The Entered Choice Is Not Valid (1-5).\n");
                        System.out.print("Please Re-Enter Choice: ");
                        choice2 = sc.nextInt();
                    }
                    while (exit2 != 0) {
                        switch (choice2) {
                            case 1: {
                                if (c == c1 && l == l1) {
                                    cong = new double[c][l];
                                    System.out.print("Addtion of 2 arrays: ");
                                    for (i = 0; i < c; i++) {
                                        for (j = 0; j < l; j++) {
                                            cong[i][j] = b[i][j] + bb[i][j];
                                            System.out.print(cong[i][j] + " ");
                                        }
                                    }
                                    break;
                                } else {
                                    System.out.println("Ma tran khong cung cap.");
                                }

                                break;
                            }
                            case 2: {
                                if (c == c1 && l == l1) {
                                    nhan = new double[c][l];
                                    System.out.print("Addtion of 2 arrays: ");
                                    for (i = 0; i < c; i++) {
                                        for (j = 0; j < l; j++) {
                                            for (k = 0; k < c; k++) {
                                                nhan[i][j] += b[i][k] * bb[k][j];
                                            }
                                            System.out.print(nhan[i][j] + " ");
                                        }
                                    }
                                    break;
                                } else {
                                    System.out.println("Ma tran khong cung cap.");
                                }

                                break;
                            }
                            case 3: {
                                System.out.println("Back To Main Menu.");
                                exit2 = 0;
                                System.out.println("---------------------------------------------------------");
                            }
                        }
                        if (exit2 == 1) {
                            System.out.println("\n-----------------------------------------");
                            System.out.print("Enter choice (1-3): ");
                            choice2 = sc.nextInt();

                            while (choice2 <= 0 && choice2 >= 4) {
                                System.out.print("The Entered Choice Is Not Valid (1-3).\n");
                                System.out.print("Please Re-Enter Choice: ");
                                choice2 = sc.nextInt();
                            }
                        }

                    }
                    break;
                }
                case 'E': {
                    System.out.print("Exited.");
                    System.out.print("\n----------------------- Goodbye -----------------------");

                    exit = 0;
                    break;
                }
                default: {
                    System.out.print("KHONG HOP LE");
                    break;
                }
                // nhap lai choice

            }
            if (exit == 1) {
                System.out.println("------------------------ PROGRAM ------------------------");
                System.out.println("A. Enter Array A: ");
                System.out.println("B. Enter Matrix B: ");
                System.out.println("E. Exit.");
                System.out.println("---------------------------------------------------------");
                System.out.print("Enter Choice: ");
                choice = sc.next().charAt(0);
                while ((choice != 'A') && (choice != 'B') && (choice != 'E')) {
                    // System.out.print("The Entered Choice Is Not Valid (UPPER CASE).\n");
                    System.out.print("Please Re-Enter Choice: ");
                    choice = sc.next().charAt(0);
                }
            }
        }
    }
}