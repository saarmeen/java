import java.util.*;

public class multidimensionalArray{
	public static void main(String[] args){
		int[][] arr= new int [3][3];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter value ("+i+","+j+"):");
				arr[i][j]=sc.nextInt();
				System.out.println();
			}
		}
		System.out.println("the 2d array is ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(arr[i][j]+"");
			}
			System.out.println();		}
 
            
	}
}