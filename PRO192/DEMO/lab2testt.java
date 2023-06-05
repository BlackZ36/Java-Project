import java.util.*;

public class lab2testt {
    public static void main(String[] args) {
        
        String a = "financing Promoting Technology was established with the mission to develop a \'new generation university\' with a    modern educational philosophy which combines training    activities with the actual need for skills in   the country, leveraging Vietnam to a level at which it can compete    with developed countries in the world. financing     Promoting Technology trains industrial engineers, and this requires a close association with IT firms, combining   training with      reality to be able to implement the most advanced technologies.";
        String[] b ;
        int i,j;
        boolean check =true;
        int choice;
        Scanner sc = new Scanner(System.in);
        
        
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
        int n = a.length();
        b = a.split("");

        while(check){
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
                        
                        System.out.println("---------- RESULT ----------");
                        System.out.println(a);
                        System.out.println("----------------------------");
                        break;
                    }
                    case 3:{
                        
                        break;
                    }
                    case 4:{
                        
                        System.out.println("---------- RESULT ----------");
                        
                        System.out.println("");
                        System.out.println("----------------------------");
                        break;
                    }
                    case 5:{
                        System.out.println("5");
                        break;
                    }
                    case 6:{
                        int count1=0,count2=0;

                        
                        System.out.println("---------- RESULT ----------");
                        System.out.println("Nguyen am: " + count1);
                        System.out.println("Nguyen am: " + count2);
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
            }catch(Exception e){
                System.out.println("Your enter is not valid (1-7) !!!");
                sc.nextLine();
            }

        }
        
    }
}
