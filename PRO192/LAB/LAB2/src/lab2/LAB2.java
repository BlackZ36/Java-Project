
package lab2;
import java.util.*;

public class LAB2 {
    public static void main(String[] args) {
        
        String a = "financing Promoting Technology was established with the mission to develop a \'new generation university\' with a    modern educational philosophy which combines training    activities with the actual need for skills in   the country, leveraging Vietnam to a level at which it can compete    with developed countries in the world. financing     Promoting Technology trains industrial engineers, and this requires a close association with IT firms, combining   training with      reality to be able to implement the most advanced technologies.";
        String[] b;
        String temp;
        int i,j,k,count;
        boolean check =true;
        int choice;
        Scanner sc = new Scanner(System.in);
        int count1=0;
        int count2=0;
        temp = a;
        String e;
        
        
        b = temp.split("");
        int n = a.length();

        while(check){

            System.out.println("");
            System.out.println("---------------------- MENU ----------------------");
            System.out.println("1. Capitalize the first and all the letter of the next sentences.");
            System.out.println("2. Find and remove all the excess space. ");
            System.out.println("3. Find and rewrite New Generation University");
            System.out.println("4. Find and capitalize VIETNAM.");
            System.out.println("5. Find and replace financing Promoting Technology to FPT University. ");
            System.out.println("6. Count the number of vowel and consonant.");
            System.out.println("7. Exit");
            System.out.println("--------------------------------------------------");
            

            try{
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch(choice){
                    case 1:{
                        i = 0;
                        j = 2;
                        b[0] = b[0].toUpperCase();
                        while(i<n && j<n){
                            if( b[i].equals(".") ){
                                b[j] = b[j].toUpperCase();
                            }
                            i++;
                            j++;
                        }
                        a = String.join("", b);
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println(a);
                        System.out.println("");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                        break;
                    }
                    case 2:{
                        // a = String.join("", b);
                        a = a.replaceAll("\\s+"," ");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println(a);
                        System.out.println("");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                        break;
                    }
                    case 3:{
                        int index = a.indexOf("new generation university");
                        if (index != -1) {
                            String capitalized = "New Generation University";
                            a = a.substring(0, index) + capitalized + a.substring(index + "new generation university".length());
                        }
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println(a);
                        System.out.println("");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                        break;
                    }
                    case 4:{
                        int index = a.indexOf("Vietnam");
                        if (index != -1) {
                            String capitalized = "VIETNAM";
                            a = a.substring(0, index) + capitalized + a.substring(index + "Vietnam".length());
                        }
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println(a);
                        System.out.println("");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                        break;
                    }
                    case 5:{
                        int index = a.indexOf("Financing Promoting Technology");
                        if (index != -1) {
                            String capitalized = "FPT University";
                            a = a.substring(0, index) + capitalized + a.substring(index + "Financing Promoting Technology".length());
                        }
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println(a);
                        System.out.println("");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    case 6:{
                        int vowels = 0, consonants = 0;
                        a = a.toLowerCase();
                        for (i = 0; i < a.length(); i++) {
                            char c = a.charAt(i);
                            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                                vowels++;
                            } else if (Character.isLetter(c)) {
                                consonants++;
                            }
                        }
                        System.out.println("---------- RESULT ----------");
                        System.out.println("Vowels: " + vowels);
                        System.out.println("Consonants: " + consonants);
                        System.out.println("----------------------------");
                        break;
                    }
                    case 7:{
                        System.out.println("--------------------> EXITED");
                        check = false;
                        sc.close();
                        break;
                    }
                    default:{
                        System.out.println("Your enter is not valid (1-7) !!!");
                        break;
                    }
                }
            }catch(Exception e1){
                System.out.println("Your enter is not valid (1-7) !!!");
                sc.nextLine();
            }

        }
        
    }
}

