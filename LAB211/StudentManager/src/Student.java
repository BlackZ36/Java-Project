public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private String semester;
    private String course;

    public Student() {
    }

    public Student(String id, String name, String semester, String course) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.course = course;
    }

    // getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSemester() {
        return semester;
    }

    public String getCourse() {
        return course;
    }
    // setter

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // other logic methods
    @Override
    public String toString() {
        return String.format("%-12s%-20s%-15s%-15s", id, name.toUpperCase(), semester, course.toUpperCase());
    }

    @Override
    public int compareTo(Student student) {
        String thisLastName = this.getName().split(" ")[2];
        String studentLastName = student.getName().split(" ")[2];
        return thisLastName.compareTo(studentLastName);
    }

}
