import java.io.*;

public class file2{
	public static void main(String[] args){
	try{
	FileWriter Writer= new FileWriter("D:\\java\\javafiles\\myfile.txt");
	Writer.write("My owner Is the BEST!!");
	Writer.close();
	System.out.println("Successfully Written");
	}
	catch(IOException e) {
	System.out.println("An error has occured");
	e.printStackTrace();
		}
	}
}