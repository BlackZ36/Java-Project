package arrays;
import java.util.*;
import java.math.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        int i,j,n;
        int check=0;
        int temp;
        int count=0;
        System.out.print("Enter size for array; ");
        n = sc.nextInt();
        a = new int[n];
        for(i=0;i<n;i++){
            System.out.printf("Enter element %d of array: ",i+1);
            a[i] = sc.nextInt();
        }

        System.out.println("\nDuplicate number:\n");
        for (i=0;i<n-1;i++){
            for (j=i+1;j<n;j++){
                count=0;
                if( a[i]==a[j] ){
                    check++;
                    System.out.println(" -Duplicate number: "+a[i]);
                }
            }
            
        }

        //in ra man hinh check=0;
        if(check == 0){
            System.out.print(" -No duplicate number found.");
        }
    }    
}
