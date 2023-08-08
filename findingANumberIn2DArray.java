import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns");
		int n= sc.nextInt();
		int m= sc.nextInt();
		
		System.out.println("Enter the numbers for the matrix");
		
		int[][] numbers=new int[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        numbers[i][j]=sc.nextInt();
		    }
		}
		System.out.println("Enter the number to find");
		int x= sc.nextInt();
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		      if(numbers[i][j]==x){
		        System.out.println("the number is at "+(i+1)+" row and "+(j+1)+" column");  
		      }
		    }
		}
		
		
	}
}
