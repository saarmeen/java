import java.util.*;
public class min_to_years{
	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = sc.nextDouble();

        double min_to_Year = 60 * 24 * 365;


        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}