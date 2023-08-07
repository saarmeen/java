import java.util.*;
public class arrAverage{
	public static void main(String[] args){
	Double[] arr = {19.00, 12.04, 16.34, 200.00, 1.3};
        Double total = 0.00;
         for(int i=0; i<arr.length; i++){
         	total=total+arr[i];
         }
         	 average= total/arr.length;
         System.out.println(average);
	}
}