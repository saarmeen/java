import java.util.*;
public class ExamGrades {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine(); // consume newline character
        
        float[][] grades = new float[numStudents][];
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Enter the number of courses for student %d (min 2, max 5): ", i + 1);
            int numCourses = input.nextInt();
            input.nextLine(); // consume newline character
            
            grades[i] = new float[numCourses];
            for (int j = 0; j < numCourses; j++) {
                System.out.printf("Enter the grade for course %d of student %d: ", j + 1, i + 1);
                grades[i][j] = input.nextFloat();
            }
        }
        
        // Display the grades in tabular format
        System.out.println("\nGrades:");
        System.out.print("  |");
        for (int j = 0; j < grades[0].length; j++) {
            System.out.printf("%5d|", j + 1);
        }
        System.out.printf("%10s|\n", "Average");
        
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%2d|", i + 1);
            float rowSum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                System.out.printf("%5.2f|", grades[i][j]);
                rowSum += grades[i][j];
            }
            float rowAvg = rowSum / grades[i].length;
            System.out.printf("%10.2f|\n", rowAvg);
        }
        
        // Calculate and display the column averages
        System.out.print("  |");
        for (int j = 0; j < grades[0].length; j++) {
            System.out.print("-------|");
        }
        System.out.println("-----------");
        System.out.print("  |");
        for (int j = 0; j < grades[0].length; j++) {
            float colSum = 0;
            for (int i = 0; i < grades.length; i++) {
                colSum += grades[i][j];
            }
            float colAvg = colSum / grades.length;
            System.out.printf("%5.2f|", colAvg);
        }
        System.out.println();
    }

}
