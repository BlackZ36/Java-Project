
import java.util.*;

public class ex4 {
    public static void main(String[] args){
        double a,b,c,d,e;
        int i,j,k,n;
        String[] count;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter number: ");
        a = sc.nextDouble();
        Double a1=a;
        count = a1.toString().split("\\.");
        //System.out.println("decimal digits: " + count[1].length());
        n = count[1].length();
        
        // for(i=1;i<n;i++){
        //     System.out.printf("\nRounding to digit %d: ",i);
        //     b = a - (int)a;
        //     c = b * ( Math.pow(10,i) );
        //     d = c - (int)c;

        //     if( d < 0.5 ){
        //         e=(int)c / Math.pow(10,i);
        //         System.out.print((int)a + e);
        //     }
        //     else if ( d > 0.5 ){
        //         e=((int)c+1) / Math.pow(10,i);
        //         System.out.print((int)a + e);
        //     }
        // }
        System.out.printf("Enter decimal number order for rounding(n<%d): ",count[1].length());
        int dem = sc.nextInt();
        for(i=0;i<=dem;i++){
            if(i==dem){
                System.out.printf("Rounding to digit %d: ",i);
                b = a - (int)a;
                c = b * ( Math.pow(10,i) );
                d = c - (int)c;

            if( d < 0.5 ){
                e=(int)c / Math.pow(10,i);
                System.out.print((int)a + e);
            }
            else if ( d > 0.5 ){
                e=((int)c+1) / Math.pow(10,i);
                System.out.print((int)a + e);
            }
            }
        }
    }

}
