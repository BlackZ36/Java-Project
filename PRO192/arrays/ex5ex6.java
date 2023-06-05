package arrays;

import java.util.*;

public class ex5ex6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double[] a;
        int i,j,n;

        System.out.print("Enter size for array: ");
        n = sc.nextInt();
        a = new double[n];
        for(i=0;i<n;i++){
            System.out.printf("Enter element %d for array: ",i+1);
            a[i] = sc.nextDouble();
        }
        Arrays.sort(a);
        System.out.println("1, 2nd largest element in array: "+ (a[n-2]) );
        System.out.println("2, 2nd smallest element in array: "+ (a[1]) );
    }    
}
