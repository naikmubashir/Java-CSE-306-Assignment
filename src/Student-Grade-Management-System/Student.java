import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int id;
    private List<Integer> grades;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    // Method to add a grade to the grades list
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Calculate the average grade
    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Find the highest grade
    public int findHighestGrade() {
        if (grades.isEmpty()) {
            return -1; // No grades
        }
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Find the lowest grade
    public int findLowestGrade() {
        if (grades.isEmpty()) {
            return -1; // No grades
        }
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    // Display grade report
    public void displayGradeReport() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Grades: " + grades);
        System.out.printf("Average Grade: %.2f%n", calculateAverageGrade());
        System.out.println("Highest Grade: " + findHighestGrade());
        System.out.println("Lowest Grade: " + findLowestGrade());
        System.out.println();
    }
}