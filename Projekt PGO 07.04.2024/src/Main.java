public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup("Group A", "G001");

        Student student1 = new Student("John", 20, "S001", group);
        Student student2 = new Student("Alice", 21, "S002", group);

        student1.addGrade(4.0);
        student1.addGrade(3.5);
        student2.addGrade(5.0);

        System.out.println("Students Information:");
        student1.displayInfo();
        student2.displayInfo();

        System.out.println("\nAverage Grades:");
        System.out.println("Student 1 Average Grade: " + student1.calculateAverageGrade());
        System.out.println("Student 2 Average Grade: " + student2.calculateAverageGrade());

        group.addStudent(student1);
        group.addStudent(student2);
        System.out.println("\nGroup Information:");
        group.displayInfo();


        try {
            group.addStudent(student1);
        } catch (IllegalStateException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}
