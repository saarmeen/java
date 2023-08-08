import java.util.*;
public class OddEvenInArray{ 
	public static void main(String args[]){  
		Scanner inp = new Scanner(System.in);
        System.out.print("\n Enter Size of Array: ");
        int n = inp.nextInt();
        int i, sum = 0;
        int arr[] = new int[n]; 
        int odd=0,even=0;
        System.out.print("\n Enter the values: ");
        
        for ( i = 0; i < n; i++) { 
            
            arr[i] = inp.nextInt();
        }
		
		for( i=0;i<arr.length;i++){  
			if(arr[i]%2!=0){  
				odd++;  
				
			} 
			  

		}  
		System.out.println("Odd Numbers:" +odd); 
		
		for( i=0;i<arr.length;i++){  
			if(arr[i]%2==0){  
				even++;  
				
			}  
		
		}
		System.out.println("Even Numbers:" +even);		
	}
}		  
		