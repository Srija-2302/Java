package CDC;

public class Demo11 {
	int a;
	int b;
	public Demo11(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
	public static void main(String[] args) {
		Demo11 d1=new Demo11(78,30);
		d1.add();
	}
}
