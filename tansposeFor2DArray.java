import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the rows and columns of the matrix");
		
		int n= sc.nextInt();
		int m= sc.nextInt();
		
		int[][] numbers= new int[n][m];
		
		System.out.println("Enter the number for the matrix");
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        numbers[i][j]= sc.nextInt();
		    }
		}
		
		//for the transpose of the matrix
		
		System.out.print("The transpose is :-");
		
		for(int j=0;j<m;j++){
		    for(int i=0;i<n;i++){
		        System.out.print(numbers[i][j]+" ");
		    }System.out.println();
		}
		
	}
}
