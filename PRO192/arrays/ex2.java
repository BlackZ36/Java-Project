package arrays;
import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] a;
        int i,n;
        double sum=0;
        System.out.print("Enter size for array; ");
        n = sc.nextInt();
        a = new double[n];
        for(i=0;i<n;i++){
            System.out.printf("Enter element %d of array: ",i+1);
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        System.out.println("Sum of array: " + sum);
    }
}
