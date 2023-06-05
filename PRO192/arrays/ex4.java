
package arrays;
import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        double[] a;
        int i,j,n;
        double sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size for array: ");
        n = sc.nextInt();
        a = new double[n];
        for(i=0;i<n;i++){
            System.out.printf("Enter element %d for array: ",i+1);
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        System.out.printf("Avg value of array: %.2f",(sum/n));
    }
}
