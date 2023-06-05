import java.util.*;

public class romanNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input;
        int i,j,n;
        int sum=0;

        System.out.print("Enter Roman Number: ");
        //sc.nextLine(); clear buffer but no integer entered before
        input = sc.nextLine();
        String input1 = input.toUpperCase();
        n=input1.length();
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                char a = input1.charAt(i);
                char b = input1.charAt(j);
                if( a == 'I'){
                    if( b == 'V'){
                        sum += 4;
                    }
                    else if( b == 'X'){
                        sum += 9;
                    }
                    else
                        sum +=1;
                }
                if(a == 'X'){
                    if(b == 'L'){
                        sum +=40;
                    }
                    else if( b == 'C'){
                        sum += 90;
                    }
                    //else
                        sum += 100;
                }
            }

        }
        System.out.print(sum);
    
        
    }
}

