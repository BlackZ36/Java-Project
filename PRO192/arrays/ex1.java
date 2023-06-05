package arrays;
import java.util.*;;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double[] a;
        String str;
        String[] str1;
        int i,j,k;

        System.out.print("Enter size of number array: ");
        int n = sc.nextInt();
        a = new Double[n];
        for(i=0;i<n;i++){
            System.out.printf("Enter element %d of array: ",i+1);
            a[i] = sc.nextDouble();
        }
        System.out.print("---------------------------------------");
        System.out.print("\nEnter String: ");
        sc.nextLine();
        str = sc.nextLine();
        str1 = str.split(" ");

        // in ra mang ban dau
        System.out.print("---------------------------------------\n");
        System.out.println("Entered number array: " + Arrays.toString(a));
        System.out.println("Entered string array: " + str);

        // sap xem tang dan
        System.out.print("---------------------------------------\n");
        Arrays.sort(a);
        Arrays.sort(str1);
        System.out.println("Ascesding sorted number array: " + Arrays.toString(a));
        System.out.println("Ascesding sorted string array: " + Arrays.toString(str1));

        // sap xep giam dan
        System.out.print("---------------------------------------\n");
        Arrays.sort(a,Collections.reverseOrder());
        Arrays.sort(str1,Collections.reverseOrder());
        System.out.println("Descending sorted number array: " + Arrays.toString(a));
        System.out.println("Descending sorted string array: " + Arrays.toString(str1));
    }
}
