import java.util.*;

public class StudentList {

    private static int flush = 0;

    private static final Scanner sc = new Scanner(System.in);

    public static void add(int number, ArrayList<Student> list) {
        String tempName = "";
        if (number > 10) {
            System.out.print("Do you want to continue (Y/N)?: ");
            if (!Valid.inputYN()) {
                return;
            }
        }

        number++;
        while (true) {
            System.out.printf("Enter Student %d ID: ", number);
            String id = Valid.inputID();

            if (!Valid.checkIdExist(list, id)) {
                tempName = Valid.getName(list, id);
            }

            System.out.printf("Enter Student %d Name: ", number);
            flush = 1;
            String name = Valid.inputName(flush);

            if (!name.equalsIgnoreCase(tempName)) {
                System.out.println("ID and Name are not duplicate.");
                continue;
            }

            System.out.printf("Enter Student %d Semester: ", number);
            String semester = Valid.inputSemeter();
            System.out.printf("Enter Student %d Course Name: ", number);
            String course = Valid.inputCourse();

            if (Valid.checkStudentExist(list, id, name, semester, course)) {
                list.add(new Student(id, name, semester, course));
                System.out.println("---> Student Added Successfully.");
                return;
            } else
                System.out.println("---> Student Duplicated.");

        }

    }

    public static void findAndSort(ArrayList<Student> list) {
        ArrayList<Student> tempList = new ArrayList<>();
        System.out.print("Enter Name: ");
        String name = Valid.inputName(flush);
        for (Student student : list) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                tempList.add(student);
            }
        }

        if (tempList.isEmpty()) {
            System.out.println("list empty");
        } else {
            Collections.sort(tempList);
            display(tempList);
        }

    }

    public static void updateAndDelete(ArrayList<Student> list) {
        boolean check = false;
        if (list.isEmpty()) {
            System.out.println("EMPTY List.");
            return;
        }
        System.out.print("Enter ID: ");
        String id = Valid.inputID();
        for (Student student : list) {
            if (student.getId().equals(id)) {
                check = true;
            }
        }
        if (check == true) {
            System.out.print("Enter U and D: ");
            boolean ud = Valid.inputUD();
            ArrayList<Student> tempList = Valid.getStudent(list, id);
            if (ud) {

                list.removeAll(tempList);

                for (Student student : tempList) {
                    System.out.printf("\n---- UPDATING (%s - %s - %s - %s) ----\n", student.getId(), student.getName(),
                            student.getSemester(), student.getCourse());
                    flush = 1;
                    System.out.print("Enter name: ");
                    System.out.println(flush);
                    String name = Valid.inputName(flush);
                    System.out.print("Enter Semester: ");
                    String semester = Valid.inputSemeter();
                    System.out.print("Enter Course Name: ");
                    String course = Valid.inputCourse();
                    student.setName(name);
                    student.setSemester(semester);
                    student.setCourse(course);
                    System.out.println("---> UPDATED SUCCESFULLY.");

                }
                list.addAll(tempList);
            } else {
                list.removeAll(tempList);
                System.out.println("---> DELETED SUCCESSFULLY.");
            }
        } else
            System.out.println("Student ID Not Available.");
    }

    public static void display(ArrayList<Student> list) {
        System.out.printf("%-12s%-20s%-15s%-15s\n", "ID", "Student Name", "Semester", "Course Name");
        System.out.println("");
        ArrayList<Student> tempList = new ArrayList<>(list);
        Collections.sort(tempList);
        for (Student student : tempList) {
            System.out.println(student);
        }
    }

    public static void generateReport(ArrayList<Student> list) {
        ArrayList<String> reportData = new ArrayList<>();

        for (Student student : list) {
            String name = student.getName();
            String course = student.getCourse();
            int count = getCount(list, name, course);

            String entry = String.format("%-15s | %-5s | %d", name.toUpperCase(), course, count);
            if (!reportData.contains(entry)) {
                reportData.add(entry);
            }
        }

        Collections.sort(reportData, new Comparator<String>() {
            @Override
            public int compare(String entry1, String entry2) {
                String[] parts1 = entry1.split(" \\| ");
                String[] parts2 = entry2.split(" \\| ");
                String name1 = parts1[1];
                String name2 = parts2[1];

                return name2.compareTo(name1);
            }
        });

        for (String entry : reportData) {
            System.out.println(entry);
        }
    }

    private static int getCount(ArrayList<Student> list, String name, String course) {
        int count = 0;
        for (Student student : list) {
            if (student.getName().equals(name) && student.getCourse().equals(course)) {
                count++;
            }
        }
        return count;
    }
}
