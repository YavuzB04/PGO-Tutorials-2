import java.util.ArrayList;
import java.util.List;
public class Student {
    public String name;
    public int age;
    public String studentId;
    public StudentGroup group;
    private List<Double> grades = new ArrayList<>();

    public Student(String name, int age, String studentId, StudentGroup group) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.group = group;
    }

    public void addGrade(double grade) {
        if (grades.size() >= 20) {
            throw new IllegalStateException("Student can have at most 20 grades.");
        }
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Student has no grades.");
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        return roundToNearestHalf(average);
    }

    private double roundToNearestHalf(double value) {
        return Math.round(value * 2) / 2.0;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Group: " + group.name);
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
}