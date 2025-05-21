package CDC;

public class Demo10 {
	int a=89;
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
		
	}
	public static void main (String[] args) {
		Demo10 d1=new Demo10();
		d1.sub();
	}
}
