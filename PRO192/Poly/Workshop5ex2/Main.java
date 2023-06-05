package Poly.Workshop5ex2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person1[] e = new Person1[10];
        int n = 0, c = 0;
        do {
            System.out.print("Worker (1); Officer(2): ");
            Scanner sc = new Scanner(System.in);
            c = sc.nextInt();
            if (c == 1) {
                // accept information of worker
                System.out.print("Enter worker name: ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("Enter worker working hours: ");
                int hrs = sc.nextInt();
                e[n] = new Worker(name, hrs);

                n++;
            } else if (c == 2) {
                // accept information of Officer
                System.out.print("Enter Officer name: ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("Enter officer salary: ");
                double salary = sc.nextDouble();
                e[n] = new Officer(name, salary);
                n++;
            }
        } while (c != 0);
        // print all objects of e
        for (int i = 0; i < n; i++) {
            
            // print the instance of Worker only
            //if (e[i] instanceof Officer)
                System.out.println("--------------------");
                e[i].display();
        }

    }
}
