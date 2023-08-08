import java.io.*;

class file5{
	public static void main(String[] args){
		File obj=new File("D:\\java\\javafiles\\myfile.txt");
		if(obj.delete()){
			System.out.println("The deleted file is "+obj.getName());
			}
		else{
			System.out.println("Failed in deleting the file");
		}
	}
}