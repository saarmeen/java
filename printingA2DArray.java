import java.util.*;

public class printingA2DArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns for the matrix");
        int m= sc.nextInt();
        int n= sc.nextInt();
        
        int [][] numbers= new int[m][n];
        System.out.println("Enter the numbers for the matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                numbers[i][j]=sc.nextInt();
                
            }
        }for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(numbers[i][j] + " ");
            }System.out.println();
        }
    }
}