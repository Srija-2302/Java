package CDC;

public class Demo7 {
	int a;
	public Demo7(int a) {
		this.a=a;
		System.out.println("good morning" +a);
		
	}
	public static void main(String[] args) {
		Demo7 d1=new Demo7(45);
		Demo7 d2=new Demo7(56);
		Demo7 d3=new Demo7(34);
	}

}
