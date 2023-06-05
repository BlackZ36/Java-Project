
import java.util.*;

public class Program {

    private static final Scanner sc = new Scanner(System.in);

    public static int menuChoice(){
        int choice;

        System.out.println("========== Matrix Calcualtor Program ==========");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Exit");

        while(true){
            try {
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                if(choice<1 || choice>4){
                    throw new Exception();
                }
                return choice;
            } catch (Exception e) {
                System.out.print("INVALID Choice - Re-");
                sc.nextLine();
            }
        }
    }

    public static void menu(){
        boolean menu = true;
        while(menu){

            int choice = menuChoice();

            switch(choice){
                case 1:{
                    matrixCalculator.add();
                    break;
                }
                case 2:{
                    matrixCalculator.sub();
                    break;
                }
                case 3:{
                    matrixCalculator.multiply();
                    break;
                }
                case 4:{
                    System.out.println("Exited.");
                    menu = false;
                    break;
                }
            }

        }
    }

    public static void main(String[] args) throws Exception {
        menu();
    }
}
