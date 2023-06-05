/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayex;
import java.util.*;


/**
 *
 * @author BlackZ36
 */
public class ArrayEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] NumArray;
        int n,i,j;
        double temp;
        String StringArray;
        
        System.out.print("1.Enter size of number array: ");
        n = sc.nextInt();
        NumArray = new double[n];
        for(i=0;i<n;i++){
            System.out.printf("    -Enter element %d: ",i);
            NumArray[i] = sc.nextDouble();
        }
        
        System.out.print("2.Enter String Array: ");
        sc.nextLine();
        StringArray = sc.nextLine();
        
        
        System.out.println();
        //sap xep giam dan
        System.out.print("Desc number array: ");
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(NumArray[i] < NumArray[j]){
                    temp = NumArray[i];
                    NumArray[i] = NumArray[j];
                    NumArray[j] = temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.printf(" %.1f  ",NumArray[i]);
        }
        //sap xep tang dan
        System.out.println();
        System.out.print("Asc number array: ");
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(NumArray[i] > NumArray[j]){
                    temp = NumArray[i];
                    NumArray[i] = NumArray[j];
                    NumArray[j] = temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.printf(" %.1f  ",NumArray[i]);
        }
        
        String[] StringArray1 = null;
        StringArray1 = StringArray.split(" ");
        int size = StringArray1.length;
        for(i=0;i<size-1;i++){
            for(j=i+1;j<size;j++){
                if( StringArray1[i].compareTo(StringArray1[j]) > 0 ){
                    String temp1 = StringArray1[i];
                    StringArray1[i] = StringArray1[j];
                    StringArray1[j] = temp1;
                }
            }
        }
        
        System.out.println("\n");
        System.out.println("Asc string array: " + Arrays.toString(StringArray1));
        
        
         for(i=0;i<size-1;i++){
            for(j=i+1;j<size;j++){
                if( StringArray1[i].compareTo(StringArray1[j]) < 0 ){
                    String temp1 = StringArray1[i];
                    StringArray1[i] = StringArray1[j];
                    StringArray1[j] = temp1;
                }
            }
        }
        
        System.out.println("Desc string array: " + Arrays.toString(StringArray1));
    }
    
}
