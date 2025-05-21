package CDC;

public class Demo25 implements Runnable {
	public void run() {
		System.out.println("hi");
		}
	public static void main(String[] args) {
		Demo25 t1=new Demo25();
	Thread p1=new Thread(t1);
	Thread p2=new Thread(t1);
	System.out.println("hello");
	p1.start();
	p2.start();
	}

}
