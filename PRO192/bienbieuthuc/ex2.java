

import java.util.*;

public class ex2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a;
		System.out.print("Enter a: ");
		a=sc.nextDouble();
		System.out.println("Integral part: " + (int)a);
		System.out.println("Integral part: " + (a-(int)a) );
	}
}

