import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String name;
    public String groupId;
    private List<Student> students = new ArrayList<>();

    public StudentGroup(String name, String groupId) {
        this.name = name;
        this.groupId = groupId;
    }

    public void addStudent(Student student) {
        if (students.size() >= 15) {
            throw new IllegalStateException("Group cannot have more than 15 students.");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Student is already in the group.");
        }
        students.add(student);
        student.group = this;
    }

    public void displayInfo() {
        System.out.println("Group Name: " + name);
        System.out.println("Group ID: " + groupId);
        System.out.println("Number of Students: " + students.size());
    }
}