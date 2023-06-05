package trycatch;

import java.util.Scanner;

public class LAB22 {
    public static void main(String[] args) {
        String a;
        boolean check = true;
        Scanner sc = new Scanner(System.in);

        do{
            try{
                System.out.print("Input the string 1: ");
                a = sc.nextLine();
                if( a.matches("SE(.*)") == false ){
                    throw new Exception();
                }

                System.out.println("the string is " + a);
                check = false;
            }catch(Exception ex1){
                System.out.println("the string is invalid.");
                check = true;
            }
        }while(check);

    }
}
