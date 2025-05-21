package CDC;

public class Test1 {
	public static void main(String args[]) {
		int a = 10;
		if(a%2==0) {
			System.out.println("satisfy");
		}
		else {
			if(a%3==0) {
				System.out.println("satisfy");
			}
			else {
				System.out.println("Not satisfy");
			}
		}
	}
}