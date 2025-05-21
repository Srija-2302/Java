package CDC;

public class Demo22 {
	static void add(int a,int b) throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException(" ");
		}
	int c=a/b;
	System.out.println(c);
	
    }
public static void main(String[] args) {
	try {
		add(10,0);
		
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			}
		}
		
}


