package Encapsulation.CarShopManager;

import java.util.*;

public class CarShopManager {
    public static void main(String[] args) {
        String Name = null;
        String Model = null;
        String Manufacturer = null;
        int OptionsAvailable = 0;
        int EnginePower = 0;
        int Price = 0;
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        int i = 0, quantity = 0, button = 0;
        int select = 0;

        while (status) {
            try {
                System.out.print("Enter number of car (1-5): ");
                quantity = sc.nextInt();
                if (quantity < 1 || quantity > 5) {
                    throw new Exception();
                }
                status = false;
            } catch (Exception e) {
                System.out.println("Entered number is not valid!");
                sc.nextLine();
                status = true;
            }
        }
        System.out.println("--------------------------------------");
        CarDetail[] carDetailArray = new CarDetail[quantity];
        for (i = 0; i < quantity; i++) {
            carDetailArray[i] = new CarDetail();
        }
        System.out.println("quantity: " + quantity);
        status = true;
        for (i = 0; i < quantity; i++) {
            status = true;
            while (status) {
                try {
                    sc.nextLine(); // clear buffer
                    System.out.println("Enter Information for the car number " + (i + 1));
                    System.out.print("1. Enter Name: ");
                    Name = sc.nextLine();
                    carDetailArray[i].setName(Name);
                    System.out.print("2. Enter Model: ");
                    Model = sc.nextLine();
                    carDetailArray[i].setModel(Model);
                    System.out.print("3. Enter Manufacturer: ");
                    Manufacturer = sc.nextLine();
                    carDetailArray[i].setManufacturer(Manufacturer);
                    System.out.print("4. Enter Number Of Available Option: ");
                    OptionsAvailable = sc.nextInt();
                    carDetailArray[i].setOptionsAvailable(OptionsAvailable);
                    System.out.print("5. Enter Engine HP: ");
                    EnginePower = sc.nextInt();
                    carDetailArray[i].setEnginePower(EnginePower);
                    System.out.print("6. Enter Price $: ");
                    Price = sc.nextInt();
                    carDetailArray[i].setPrice(Price);
                    System.out.println("--------------------------------------");
                    status = false;

                } catch (Exception e) {
                    System.out.println("Invalid Input. Please Re-Enter.");
                    System.out.println("------------------------------");
                    status = true;
                }
            }
        }
        // button driven menu

        status = true;
        while (status) {
            System.out.println("-------------------- Car Shop Manager --------------------");
            System.out.println("1. Show Car Information.");
            System.out.println("2. Change Created Car Information.");
            System.out.println("3. Show Maximum Speed Of Selected Car.");
            System.out.println("4.Leave Car Shop Manager.");
            System.out.println("----------------------------------------------------------");
            try {
                System.out.print("Enter Button (1-4): ");
                button = sc.nextInt();
                if (button < 1 || button > 4) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entered Button is INVALID. Try Again !");
                System.out.println("--------------------------------------");
            }
            
            try {
                switch (button) {
                    case 1: {
                        System.out.print("Enter Car Number: ");
                        select = sc.nextInt();
                        select--;
                        carDetailArray[select].Show();
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        break;
                    }
                    case 4: {
                        status = false;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("invalid input.");
            }
        }
    }
}
