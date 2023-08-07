import java.util.*;
public class SalesSummary {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[][] sales = new int[5][4];
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter sales data for salesperson " + (i+1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter sales for product " + (j+1) + ": ");
                sales[j][i] = scanner.nextInt();
            }
        }
        

        int[] productTotals = new int[5];
        for (int i = 0; i < 5; i++) {
            int productTotal = 0;
            for (int j = 0; j < 4; j++) {
                productTotal += sales[i][j];
            }
            productTotals[i] = productTotal;
        }
        
       
        int[] salespersonTotals = new int[4];
        for (int i = 0; i < 4; i++) {
            int salespersonTotal = 0;
            for (int j = 0; j < 5; j++) {
                salespersonTotal += sales[j][i];
            }
            salespersonTotals[i] = salespersonTotal;
        }
        
        
        System.out.printf("%12s%12s%12s%12s%12s%12s%n", "Product/Salesperson", "1", "2", "3", "4", "Total");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%12d", i+1);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%12d", sales[i][j]);
            }
            System.out.printf("%12d%n", productTotals[i]);
        }
        System.out.printf("%12s%n", "Total");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%12d", salespersonTotals[i]);
        }
        System.out.printf("%12s%n", "");
        
        scanner.close();
    }

}
