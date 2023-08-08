import java.util.*;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        int choice;
        do {
            System.out.println("\n1. Sum of all elements");
            System.out.println("2. Sum of alternate elements");
            System.out.println("3. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int i = 0; i < size; i++) {
                        sum += array[i];
                    }
                    System.out.println("Sum of all elements: " + sum);
                    break;
                case 2:
                    int altSum = 0;
                    for (int i = 0; i < size; i += 2) {
                        altSum += array[i];
                    }
                    System.out.println("Sum of alternate elements: " + altSum);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
                    break;
            }

        } while (choice != 3);
    }
}
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        int choice;
        do {
            System.out.println("\n1. Sum of all elements");
            System.out.println("2. Sum of alternate elements");
            System.out.println("3. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int i = 0; i < size; i++) {
                        sum += array[i];
                    }
                    System.out.println("Sum of all elements: " + sum);
                    break;
                case 2:
                    int altSum = 0;
                    for (int i = 0; i < size; i += 2) {
                        altSum += array[i];
                    }
                    System.out.println("Sum of alternate elements: " + altSum);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
                    break;
            }

        } while (choice != 3);
    }
}
