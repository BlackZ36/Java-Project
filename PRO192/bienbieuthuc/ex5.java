
import java.util.*;

public class ex5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        String number;
        String[] number1;

        System.out.print("Enter an integer: ");
        a = sc.nextInt();
        number = Integer.toString(a);
        number1 = number.split("");

        int i;
        int n = number1.length;
        // System.out.print("length: " + n);
        for(i=n-1;i>=0;i--){
            System.out.print(number1[i]);
        }
    }
}
