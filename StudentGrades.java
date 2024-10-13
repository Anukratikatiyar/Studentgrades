import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        int numStudents;

        // Getting the number of students from the teacher
        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();

        // Entering the grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }

        // Calculate and display the average, highest, and lowest grades
        double average = calculateAverage(grades);
        double highest = Collections.max(grades);
        double lowest = Collections.min(grades);

        System.out.println("\nResults:");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }

    // Method to calculate the average grade
    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
