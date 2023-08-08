import java.util.*;
public class temperature{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the temperature =");
		 int temp= sc.nextInt();
		 int n=0;
		 int higherTemp=40;
		 int lowerTemp=20;
		 int vlowTemp=5;
		 int vhighTemp=50;


		 if(temp<lowerTemp){
		 	n=1;
		 }

		 if(temp>higherTemp){
		 	n=2;
		 }

		 if(temp>lowerTemp||temp<higherTemp){
		 	n=3;
		 }

		 if(temp<vlowTemp){
		 	n=4;
		 }
		 if(temp>vhighTemp){
		 	n=5;
		 }

		 
		 switch(n){
		 case 1:
		 	
		 		System.out.println("temperature is low");
		 		break;
			 	
		 case 2:
		 	
		 		System.out.println("temperature is high");
		 		break;
		 	    
		 case 3:
		 	
		 		System.out.println("temperature is moderate");
		 		break;


		 case 4:
		 	
		 		System.out.println("temperature is very low");
		 		break;

		 case 5:
		 	
		 		System.out.println("temperature is very high");
		 		break;
		 	    
		 default:
		 	System.out.println("enter a valid temperature");
		 	break;
		 	}

		 }

	}
