public class Student {

    private String name;
    private String studentNumber;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Student Number: " + studentNumber);
    }
}