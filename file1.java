import java.io.*;

public class file1{
	public static void main(String[] args){
	try{
		File obj = new File("myfile.txt");
		if(obj.createNewFile()){
		System.out.println("File is Created of name\t"+obj.getName());
		}
		else{
		System.out.println("File already exist");
		}
		}
		catch(IOException e){
		System.out.println("An error has occured");
		e.printStackTrace();
		}


	}
}