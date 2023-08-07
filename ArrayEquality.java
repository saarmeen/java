import java.util.*;
public class ArrayEquality {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the size of the first array:");
        int n1 = sc.nextInt();

         
        int[] arr1 = new int[n1];

        
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("The first array is: " + Arrays.toString(arr1));


        System.out.println("Enter the size of the second array:");
        int n2 = sc.nextInt();

         
        int[] arr2 = new int[n2];

         
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

         
         System.out.println("The second array is: " + Arrays.toString(arr2));

          
         boolean equal = Arrays.equals(arr1, arr2);

          
         if (equal) {
             System.out.println("Both arrays are equal.");
         } else {
             System.out.println("Both arrays are not equal.");
         }

         }
    }
    

