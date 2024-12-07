

public class StudentGradeManagementSystem {
    public static void main(String[] args) {
        // Create multiple students
        Student student1 = new Student("Mubashir", 1);
        Student student2 = new Student("Fahad", 2);
        Student student3 = new Student("Shabahat", 3);

        // Add grades to each student
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(78);

        student2.addGrade(88);
        student2.addGrade(92);
        student2.addGrade(79);
        student2.addGrade(94);

        student3.addGrade(70);
        student3.addGrade(72);
        student3.addGrade(68);

        // Display grade reports for all students
        System.out.println("Grade Reports:\n");
        student1.displayGradeReport();
        student2.displayGradeReport();
        student3.displayGradeReport();
    }
}
