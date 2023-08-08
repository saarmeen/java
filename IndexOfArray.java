import java.util.*;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int[] evenArray = new int[size];
        int[] oddArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();

            if (array[i] % 2 == 0) {
                evenArray[i] = array[i];
            } else {
                oddArray[i] = array[i];
            }
        }

        System.out.println("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nEven Array: ");
        for (int i = 0; i < size; i++) {
            if (evenArray[i] != 0) {
                System.out.print(evenArray[i] + " ");
            }
        }

        System.out.println("\nOdd Array: ");
        for (int i = 0; i < size; i++) {
            if (oddArray[i] != 0) {
                System.out.print(oddArray[i] + " ");
            }
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nNumber of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
