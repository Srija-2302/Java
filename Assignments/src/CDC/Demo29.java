package CDC;
import java.io.*;
public class Demo29 {
	public static void main(String[] args) throws IOException{
		File f1=new File("C:\\Users\\sredd\\OneDrive\\Pictures\\Desktop\\sandeep19.txt");
				if (f1.createNewFile()) {
					System.out.println("file created sucessfully");
					
				}else {
					System.out.println("file not created");
				}
	}

}
