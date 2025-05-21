package CDC;

public class Demo12 {
	int x;
	int y;
	public Demo12(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
		
	}
	public Demo12(Demo12 d1) {
		this.x=d1.x;
		this.y=d1.y;
		System.out.println(x-y);
		
	}
	public static void main(String[] args) {
		Demo12 d1=new Demo12(38,30);
		Demo12 d2=new Demo12(d1);
		
	}

}
