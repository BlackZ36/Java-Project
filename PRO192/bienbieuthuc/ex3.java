
import java.util.*;

public class ex3 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a;
		System.out.print("Enter a: ");
		a=sc.nextDouble();
		if( a == (int)a ){
			System.out.printf("\nThe enterd number (%d) is an integer number.",(int)a);
		}
		else
			System.out.printf("\nThe enterd number (%f) is not an integer number.",a);
	}
}
