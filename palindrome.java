import java.util.*;
public class palindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number =");
		 int n= sc.nextInt();
		 int r,sum=0,temp;

		 temp=n;
		 while(n>0){
		 	r=n%10;
		 	sum=(sum*10)+r;
		 	n=n/10;
		 }
		 if(temp==sum){
		 	System.out.println("It's a palindrome");
		 }
		 else{
		 	System.out.println("It's not a palindrome");
		 }
		}
	}