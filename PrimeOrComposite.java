import java.util.*;
public class PrimeOrComposite{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number =");
		 int n= sc.nextInt();
		 int flag=0;
		 int i;
        
  		if(n==0||n==1){  
   		System.out.println(n+" is not prime number");      
  		}
  		for(i=2;i<=n/2;i++)
  			{      
    			if(n%i==0){      
     			System.out.println(n+" is not prime number");      
     			flag=1;      
     			break;      
    		}      
   			}      
   		if(flag==0){ 
   			System.out.println(n+" is prime number"); 
   		}  
  

	}
}  
   			