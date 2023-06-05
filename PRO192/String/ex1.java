package String;
import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count,i;
        String S;
        String[] S1;

        System.out.print("Enter A String: ");
        
        S = sc.nextLine();
        S1 = S.split("");
        
        count=0;
        try{
            for(i=0;;i++){
                if(S1[i] == ""){
                    break;
                }
                count++;
            }
        }catch(Exception e1){
            System.out.println("- Length of array is: " + count);
        }

        System.out.print("- Each element of array: ");
        for(i=0;i<count;i++){
            System.out.print("[");
            System.out.print(S1[i]);
            System.out.print("] ");
            if(i<count-1){
                System.out.print("- ");
            }
        }
        System.out.println("");

        System.out.print("- Reverse element of array: ");
        for(i=count-1;i>=0;i--){
            System.out.print("[");
            System.out.print(S1[i]);
            System.out.print("] ");
            if(i>0){
                System.out.print("- ");
            }
        }
        System.out.println("");

        int dem=0;
        System.out.print("- number of word in the array: ");
        for(i=0;i<count;i++){
            if( S1[i] == ""){
                dem++;
            }
            
        }
        System.out.print(dem);
        System.out.println("");

    }
}
