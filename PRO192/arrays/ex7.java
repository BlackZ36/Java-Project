package arrays;
import java.util.*;;

public class ex7 {
    public static void main(String[] args) {
        int[] a,b;
        int n,n1;
        int i,j;
        int check=0;
        Scanner sc=new Scanner(System.in);
        
        //nhap gia tri cho array 1
        System.out.print("Enter size for array 1: ");
        n = sc.nextInt();
        a = new int[n];
        for(i=0;i<n;i++){
            System.out.printf("Enter element %d for first array: ",i+1);
            a[i] = sc.nextInt();
        }

        //nhap gia tri cho array 2
        System.out.print("----------------------------------\n");
        System.out.print("Enter size for array 2: ");
        n1 = sc.nextInt();
        b = new int[n1];
        for(i=0;i<n;i++){
            System.out.printf("Enter element %d for second array: ",i+1);
            b[i] = sc.nextInt();
        }
        //print array
        System.out.print("----------------------------------\n");
        System.out.println("- 1st array: " + Arrays.toString(a));
        System.out.println("- 2nd array: " + Arrays.toString(b));
        //tim trung lap
        System.out.print("----------------------------------\n");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(a[i] == b[j]){
                    System.out.println("-Duplicated element: " + a[i]);
                    check++;
                }
            }
        }
        if( check == 0){
            System.out.print("-No duplicated element.");
        }
    }
}
