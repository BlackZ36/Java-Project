import java.util.*;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static int menuChoice() {

        int choice = 0;

        System.out.println("");
        System.out.println("===== WELCOME TO STUDENT MANAGEMENT =====");
        System.out.println("    1.  Create");
        System.out.println("    2.  Find and Sort");
        System.out.println("    3.  Update/Delete");
        System.out.println("    4.  Report");
        System.out.println("    5.  Exit");
        System.out.println("-----------------------------------------");

        while (true) {
            try {
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                if (choice < 1 || choice > 5) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("INVALID choice - Re-");
                sc.nextLine();
            }
        }
        return choice;
    }

    public static void menuSwitch(int number, ArrayList<Student> list) {
        boolean menu = true;

        while (menu) {
            int choice = menuChoice();

            switch (choice) {
                case 1: {
                    number = list.size();
                    StudentList.add(number, list);
                    break;
                }
                case 2: {
                   StudentList.findAndSort(list);
                    break;
                }
                case 3: {
                    StudentList.updateAndDelete(list);
                    break;
                }
                case 4: {
                    ArrayList<Student> tempList = new ArrayList<>(list);
                    Collections.sort(tempList);

                    StudentList.generateReport(tempList);
                    break;
                }
                case 5: {
                    System.out.println("Exited.");
                    menu = false;
                    break;
                }

            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        int number=0;
        list.add(new Student("HE666666", "nguyen van c", "Spring", "java"));
        list.add(new Student("HE555555", "nguyen van d", "Summer", "c/c++"));
        list.add(new Student("HE333333", "nguyen van b", "fall", "java"));
        list.add(new Student("HE111111", "nguyen van a", "fall", ".net"));
        list.add(new Student("HE333333", "nguyen van b", "Spring", ".net"));
        list.add(new Student("HE111111", "nguyen van a", "Summer", "java"));
        list.add(new Student("HE111111", "nguyen van a", "fall", "java"));
        menuSwitch(number,list);

    }
}
