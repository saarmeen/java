	import java.util.*;

class Distance{
	double x1,y1;
	Distance(){
		x1=y1=0;
	}
	Distance(double x1, double y1){
		this.x1=x1;
		this.y1=y1;
	}
	static float Dist(Distance o1, Distance o2){
		return (float)Math.sqrt((float)Math.pow((o1.x1-o2.x1),2)+(float)Math.pow((o1.y1-o2.y1),2));
	}
}
class prod{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double num1,num2;
		System.out.print("Enter x and y coordinates for first point : ");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		Distance obj1=new Distance(num1,num2);
		System.out.print("Enter x and y coordinates for second point : ");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		Distance obj2=new Distance(num1,num2);
		System.out.println("The distance between both points is "+obj1.Dist(obj1,obj2));
	}
}
