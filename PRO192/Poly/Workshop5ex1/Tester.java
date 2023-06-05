package Poly.Workshop5ex1;

import java.util.*;

public class Tester {
    static public void menu() {
        System.out.println("Enter list of phone numbers");
        System.out.println("-----------------------------------------");
        System.out.print("Type of phone number ? (1 - local phone, 2 - Inter phone number, 0 /- exit): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = null;
        String cc = null;
        int choice = 0, i = 0, area = 0;
        boolean check = true;
        PhoneNumber[] phonelist = new PhoneNumber[1000];

        menu();
        
        while(check){
            try {
                choice = sc.nextInt();
                if (choice < 0 || choice > 2) {
                    throw new Exception();
                }
                check = false;
            } catch (Exception e) {
                System.out.println("Invalid input. Try Again!");
                check = true;
                sc.nextLine();
                check = true;
                System.out.print("Type of phone number ? (1 - local phone, 2 - Inter phone number, 0 /- exit): ");
            }
        }
        check = true; // nap lai gia tri true de ham while ben duoi hoat dong
        // switch choiceeeeeeeeeee
        while (check) {
            switch (choice) {
                case 1: {
                    System.out.print("Enter area code: ");
                    area = sc.nextInt();
                    System.out.print("Enter number: ");
                    sc.nextLine();
                    number = sc.nextLine();
                    phonelist[i++] = new PhoneNumber(area, number);
                    check = true;
                    break;
                }
                case 2: {
                    sc.nextLine();
                    System.out.print("Enter country code: ");
                    cc = sc.nextLine();
                    System.out.print("Enter area code: ");
                    area = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter number: ");
                    number = sc.nextLine();
                    phonelist[i++] = new IntPhoneNumber(cc, area, number);
                    break;
                }
                case 0: {
                    System.out.println("");
                    check = false;
                    sc.close();
                    break;
                }
            }
            while (check) {
                System.out.print("Type of phone number ? (1 - local phone, 2 - Inter phone number, 0 /- exit): ");
                try {
                    choice = sc.nextInt();
                    if (choice < 0 || choice > 2) {
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Try Again!");
                    check = true;
                    sc.nextLine();
                }
            }
        }

        System.out.println("List of phone number:");
        System.out.println("----------------------------------------");
        for (int j = 0; j < i; j++) {
            phonelist[j].display();
        }
    }
}