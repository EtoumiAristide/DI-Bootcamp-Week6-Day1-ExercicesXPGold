
public class Student {
    private String name;
    private int age;
    private String course;
    private char grade;

    public Student() {
        name = "Kouassi Jean";
        age = 23;
        course = "Fullstack Angular/Java";
        grade = 'B';
    }

    public Student(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String course, char grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course + ", Grade: " + grade);
    }
}
