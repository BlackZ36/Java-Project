import java.util.*;

public class Valid {
    private static final Scanner sc = new Scanner(System.in);

    public static int inputInt() {
        int input;
        while (true) {
            try {
                input = sc.nextInt();
                if (input <= 0) {
                    throw new Exception();
                }
                sc.nextLine();
                return input;
            } catch (Exception e) {
                System.out.print("Integer Only. Re-Enter: ");
                sc.nextLine();
            }
        }
    }

    public static boolean inputYN() {
        String input;
        while (true) {
            try {
                input = sc.next();
                input = input.toUpperCase();
                if (!input.equals("Y") && !input.equals("N")) {
                    throw new Exception();
                }
                if (input.equals("Y")) {
                    return true;
                } else if (input.equals("N")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.print("Must enter 'Y' or 'N'. Re-enter: ");
                sc.nextLine();
            }
        }
    }

    public static boolean inputUD() {
        String input;
        while (true) {
            try {
                input = sc.next();
                input = input.toUpperCase();
                if (!input.equals("U") && !input.equals("D")) {
                    throw new Exception();
                }
                if (input.equals("U")) {
                    return true;
                } else if (input.equals("D")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.print("Must enter 'U' or 'D'. Re-enter: ");
                sc.nextLine();
            }
        }
    }

    public static String inputName(int flush) {
        String input = "";
        while (true) {
            try {
                if (flush == 1) {
                    sc.nextLine();
                }
                input = sc.nextLine();
                if (!input.matches("[a-zA-Z ]+")) {
                    throw new Exception();
                }
                input = input.toLowerCase();
                return input;
            } catch (Exception e) {
                System.out.print("Name only include letter. Re-Enter Name: ");

            }
        }
    }

    public static String inputCourse() {
        String input;
        while (true) {
            try {
                input = sc.next();
                if (input.isEmpty()) {
                    throw new Exception();
                }
                input = input.toLowerCase();
                if (!input.matches("(java|.net|c/c\\+\\+)")) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.print("Invalid Course Name(Java | .Net | C/C++). Re-Enter: ");
                sc.nextLine();
            }
        }
    }

    public static String inputID() {
        String input;
        while (true) {
            try {
                input = sc.next();
                if (input.isEmpty()) {
                    throw new Exception();
                }
                input = input.toUpperCase();
                if (!input.matches("HE\\d{6}")) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.print("ID only HExxxxxx. Re-Enter ID: ");
                sc.nextLine();
            }
        }
    }

    public static String inputSemeter() {
        String input;
        while (true) {
            try {
                input = sc.next();
                if (input.isEmpty()) {
                    throw new Exception();
                }
                input = input.toLowerCase();
                if (!input.matches("(summer|spring|fall)")) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.print("Only Summer, Spring, Fall. Re-Enter Semester: ");
                sc.nextLine();
            }
        }
    }

    public static boolean checkIdExist(ArrayList<Student> list, String Id) {
        for (Student student : list) {
            if (Id.equalsIgnoreCase(student.getId())) {
                return false;
            }
        }
        return true;
    }

    public static String getName(ArrayList<Student> list, String Id) {
        for (Student student : list) {
            if (Id.equalsIgnoreCase(student.getId())) {
                return student.getName();
            }
        }
        return null;
    }

    public static boolean checkStudentExist(ArrayList<Student> list, String Id, String name, String semester,
            String courseName) {

        for (Student student : list) {
            if (Id.equalsIgnoreCase(student.getId())
                    && name.equalsIgnoreCase(student.getName())
                    && semester.equalsIgnoreCase(student.getSemester())
                    && courseName.equalsIgnoreCase(student.getCourse())) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Student> getStudent(ArrayList<Student> list, String id) {
        ArrayList<Student> tempList = new ArrayList<>();
        for (Student student : list) {
            if (student.getId().equals(id)) {
                tempList.add(student);
            }
        }
        return tempList;
    }

}
