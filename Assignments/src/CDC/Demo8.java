package CDC;

public class Demo8 {
	int a=90;
	public Demo8(int b) {
		b=a;
		System.out.println("good morning" +a);
		
	}
	public static void main(String[] args) {
		Demo8 d1=new Demo8(45);
		Demo8 d2=new Demo8(56);
		Demo8 d3=new Demo8(34);
	}

}
