import java.util.*;
public class Armstong{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to check Armstong:-");
		int num=sc.nextInt();
		int num1,num2,count=0,count,i,sum=0,num3;
		num1=num2=num;
		while(num1!=0){
			num1=num1/10;
			count++;
		}
		count=cout;
		for(i=0;i<=count;i++){
			num3=num2%10;
			num2=num2/10;
			sum=sum+(int)Math.pow(num3,cout);
		}
		if(sum==num){
			System.out.println("The number is armstrong");
		}
		else{
			System.out.println("The number is not armstrong")
		}
	}
}