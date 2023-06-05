package String;
import java.util.*;

public class stringex1 {
    public static void main(String[] args) {
        String a;
        String[] b;
        int i,j,k,count;
        String choice1;
        int choice2;
        int choice3;
        Scanner sc = new Scanner(System.in);
        boolean check1=true,check2=true,check3=true,check4=true;

        menu();
        do{
            try{
                System.out.print("Enter Menu Choice: ");

                check4 = false;
            }catch(Exception e){
                System.out.println("Invalid Input. Re-Start The Program !!! ");
                check4 = true;
            }
        }while(check4);
    }


    static void menu(){
        System.out.println("-------------------- MENU --------------------");
        System.out.println("A. Enter String A then enter mini menu.");
        System.out.println("B. Enter String B then enter mini menu.");
        System.out.println("C. Quit");
        System.out.println("----------------------------------------------");
    }
    static void menuA(){
        System.out.println("-------------------- STRING A --------------------");
        System.out.println("1. Count String Length w/o built-in function.");
        System.out.println("2. Count word in the string.");
        System.out.println("3. Quit");
        System.out.println("--------------------------------------------------");
    }
    static void menuB(){
        System.out.println("-------------------- STRING B--------------------");
        System.out.println("1. Count String Length w/o built-in function.");
        System.out.println("2. Count word in the string.");
        System.out.println("3. Quit");
        System.out.println("--------------------------------------------------");
    }
}






