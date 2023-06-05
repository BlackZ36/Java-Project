package trycatch;
import java.util.*;

public class LAB2 {
    public static void main(String[] args) {
        int a;
        int loop=0;
        String b;
        boolean check = true,check1=true;
        Scanner sc = new Scanner(System.in);

        do{
            try{
                System.out.print("Enter the number: ");
                if(loop != 0){
                    sc.nextLine();
                }
                a = sc.nextInt();
                if( a < 1){
                    throw new Exception();
                }
                System.out.println("The number is " + a + " after " + loop + " times.");
                check = false;

            }catch(Exception ex1){
                System.out.println("The number is invalid");
                loop++;
            }
        }while(check);
    }
}
