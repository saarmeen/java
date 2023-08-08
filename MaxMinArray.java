import java.util.*;

public class IndexOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to search:");
        int num = scanner.nextInt();

        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

        System.out.println("The elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        if (index == -1) {
            System.out.println("\nThe number is not present in the array.");
        } else {
            System.out.println("\nThe index of the number is " + index);
        }
    }
}
