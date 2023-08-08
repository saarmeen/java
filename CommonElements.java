import java.util.*;
public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            array2[i] = scanner.nextInt();
        }

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        System.out.println("Common elements:");

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    break;
                }
            }
        }
    }
}
