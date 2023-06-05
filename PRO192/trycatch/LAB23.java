package trycatch;
import java.util.*;

public class LAB23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        boolean check=true;

        do{
            try{
                System.out.print("enter an positive number: ");
                a = Integer.parseInt(sc.nextLine());

                if( a < 1){
                    throw new Exception();
                }

                System.out.println("Enterd number: " + a);
                check = false;
            }catch(Exception e){
                System.out.println("Entered number is invalid.");
                check = true;
            }
        }while(check);
    }
}
