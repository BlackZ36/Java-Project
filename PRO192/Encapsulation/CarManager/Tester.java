package Encapsulation.CarManager;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c = new Car();
        //c.pressStartButton();
        //c.pressAcceleratorButton();
        //c.output();
        String colour = "khong";
        int enginePower = 0;
        boolean convertible = false;
        boolean parkingBrake = false;
        boolean check=true;
        boolean clearBuffer = false;

        
        
        do{
            try{
                System.out.println("--------------------------------------------");
                System.out.print("Enter the colour of the car: ");
                while(clearBuffer){
                    sc.nextLine();
                    clearBuffer = false;
                }
                colour = sc.nextLine();
                System.out.print("Enter the Engine Power of the car: ");
                enginePower = sc.nextInt();
                System.out.print("Is the car convertible? (true/false): ");
                convertible = sc.nextBoolean();
                System.out.print("Is the parking brake engaged? (true/false): ");
                parkingBrake = sc.nextBoolean();
                System.out.println("--------------------------------------------");
                check = false;
                
            }catch(Exception e){
                System.out.println("Invalid enter value. Try Again !!!");
                clearBuffer = true;
                
            }
        }while(check);


    
    
        Car c2 = new Car(colour,enginePower,convertible,parkingBrake);
        c2.pressStartButton();
        c2.pressAcceleratorButton();
        c2.output();
        System.out.println("--------------------------------------------");
        System.out.println("using setcolour: mau gi day");
        c2.setColour("mau gi day");
        System.out.println("using setenginePower: 0");
        c2.setEnginePower(0);
        System.out.println("using setConvertible: false");
        c2.setConvertible(false);
        System.out.println("using setParkingBreak: false");
        c2.setParkingBrake(false);
        System.out.println("");
        System.out.print("Re-ouput: <-------------------------");
        c2.output();


    }
}
