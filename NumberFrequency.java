import java.util.*;
public class ArrayMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the array: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns in the array: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                while (true) {
                    System.out.print("Enter the element at position (" + (i+1) + ", " + (j+1) + "): ");
                    array[i][j] = scanner.nextInt();
                    if (array[i][j] >= 0 && array[i][j] <= 99) {
                        break;
                    }
                    System.out.println("Invalid input! Please enter a number between 0 and 99.");
                }
            }
        }

        System.out.println("Elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Elements of the array after multiplying odd elements by 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] *= 2;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
