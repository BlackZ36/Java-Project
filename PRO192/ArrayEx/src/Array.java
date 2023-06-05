import java.util.*;

public class Array {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0, size = 0, count = 0;
        int[] a = null;
        int[] b = null;
        int c, position;
        boolean check = true;
        int temp;

        // enter size ---------------------------------------------------
        while (check) {
            try {
                System.out.print("Enter size for array: ");
                size = sc.nextInt();
                if (size <= 0) {
                    throw new Exception();
                }
                check = false;
            } catch (Exception e) {
                System.out.println("Invalid Input. Please Try Again!");
                sc.nextLine();
            }
        }
        a = new int[size];
        System.out.println("----------------------------------------------");
        // enter size ---------------------------------------------------

        // enter element for the array------------------------------------
        check = true;
        while (check) {
            try {
                for (i = 0; i < size; i++) {
                    System.out.printf(" - Enter a[%d]: ", i);
                    a[i] = sc.nextInt();
                }
                check = false;
            } catch (Exception e) {
                System.out.println(" - Invalid Input. Please Try Again!");
                sc.nextLine();
            }
        }
        System.out.println("----------------------------------------------");
        // enter element for the array------------------------------------

        check = true;
        while (check) {
            try {
                System.out.println("-------------------- MENU --------------------");
                System.out.println("1. Add An Element Into Array.");
                System.out.println("2. Remove An Element Into Array.");
                System.out.println("3. Sort The Array Without Builtin Function.");
                System.out.println("4. Find A Given Element In The Array.");
                System.out.println("5. Exit");
                System.out.print("Enter Choice: ");
                int choice = sc.nextInt();
                if (choice < 1 || choice > 5) {
                    throw new Exception();
                }
                switch (choice) {
                    case 1: {

                        System.out.println("---------------- ADD ELEMENTS ----------------");
                        System.out.print("Enter number want to add: ");
                        c = sc.nextInt();
                        System.out.printf("Enter position (>=0 and <=%d): ", size);
                        position = sc.nextInt();
                        if (position < 0 || position > size + 1) {
                            throw new Exception();
                        }

                        b = new int[a.length + 1];

                        for (i = 0; i < position; i++) {
                            b[i] = a[i];
                        }
                        b[position] = c;
                        for (i = position + 1; i < b.length; i++) {
                            b[i] = a[i - 1];
                        }
                        a = new int[b.length];
                        System.arraycopy(b, 0, a, 0, b.length);
                        System.out.println("Result: " + Arrays.toString(a));
                        System.out.println("----------------------------------------------");
                        System.out.println("");
                        break;
                    }
                    case 2: {
                        System.out.println("--------------- REMOVE ELEMENT ---------------");
                        System.out.printf("Enter Position Of Element Want To Remove(>=0 and <=%d): ", size);
                        position = sc.nextInt();
                        if (position < 0 || position > size + 2) {
                            throw new Exception();
                        }
                        b = new int[a.length - 1];
                        for (i = 0, j = 0; i < a.length; i++) {
                            if (i != position) {
                                b[j] = a[i];
                                j++;
                            }
                        }
                        a = new int[b.length];
                        System.arraycopy(b, 0, a, 0, b.length);
                        System.out.println("Result: " + Arrays.toString(a));
                        System.out.println("----------------------------------------------");
                        System.out.println("");
                        break;
                    }
                    case 3: {
                        System.out.println("------ SORT ARRAY W/O BUILT-IN FUNCTION ------");
                        for (i = 0; i < a.length - 1; i++) {
                            for (j = i + 1; j < a.length; j++) {
                                if (a[i] > a[j]) {
                                    temp = a[i];
                                    a[i] = a[j];
                                    a[j] = temp;
                                }
                            }
                        }
                        System.out.println("Result: " + Arrays.toString(a));
                        System.out.println("----------------------------------------------");
                        System.out.println("");
                        break;
                    }
                    case 4: {
                        System.out.println("---------------- FIND ELEMENT ----------------");
                        System.out.print("Enter Element Want To Find: ");
                        c = sc.nextInt();
                        count = 0;
                        for (i = 0; i < a.length; i++) {
                            if (a[i] == c) {
                                count++;
                            }
                        }
                        if (count != 0) {
                            System.out.println("Input Value: " + c + " Appears " + count + " times ");
                        } else
                            System.out.println("The Input Value Doesn't Appear In Array ! ");
                        for (i = 0; i < a.length; i++) {
                            if (a[i] == c) {
                                System.out.printf(" - Found (%d) in postion %d \n", c, i);
                            }
                        }
                        System.out.println("----------------------------------------------");
                        System.out.println("");
                        break;
                    }
                    case 5: {
                        System.out.println("Exited.");
                        sc.close();
                        check = false;
                        System.out.println("");
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("---------------------------------------------> Invalid Input. Please Try Again!");
                sc.nextLine();

            }
        }
    }
}
