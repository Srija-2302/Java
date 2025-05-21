package CDC;
interface I1{
	void add();
	
}
class Test50{
	void sub() {
		System.out.println("hi");
		
	}
}
public class Demo18 extends Test50 implements I1 {
	public void add() {
		System.out.println("hello");
		
	
		
	}
	public static void main(String[] args) {
		Demo18 d1=new Demo18();
		d1.add();
		d1.sub();
	}
}