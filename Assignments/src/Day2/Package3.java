package Day2;
import java.util.*;

public class Package3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter a value:");
			int a= sc.nextInt();
			System.out.println("enter b value:");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException|InputMismatchException e) {
			System.out.println(e.getMessage());
			
		}

	}

}
