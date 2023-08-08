import java.util.*;
public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a number between 10 and 100: ");
            int num = scanner.nextInt();

            if (num < 10 || num > 100) {
                System.out.println("Invalid input. Number must be between 10 and 100.");
                continue;
            }

            boolean duplicate = false;
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                numbers[count] = num;
                count++;

                System.out.print("Unique numbers entered so far: ");
                for (int i = 0; i < count; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Duplicate number. Try again.");
            }
        }

        System.out.print("Final unique numbers entered: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
