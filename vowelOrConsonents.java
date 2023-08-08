import java.util.*;
public class vowelOrConsonents{
	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the alphabet:- ");

        char ch1 = sc.next().charAt(0);

         if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' ){
             System.out.println(ch1 + " is vowel");
         }
            
        else{
            System.out.println(ch1 + " is consonant");
        } 

    }
}

