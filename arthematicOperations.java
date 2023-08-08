import java.util.*;
public class arthematicOperations{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers=");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= a+b;
		int d= a*b;
		int e= a-b;
		float f= (float) a/b;
		int g= a%b;
		System.out.println("sum is = "+c);
		System.out.println("product is = "+d);
		System.out.println("subtraction is = "+e);
		System.out.println("Division is = "+f);
		System.out.println("Modulus is = "+g);
	}
}