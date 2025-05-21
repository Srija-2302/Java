package CDC;
class Test21 extends Thread{
	public void run() {
		System.out.println("hi");
	}
}
class Test31 implements Runnable{
	public void run() {
		System.out.println("good morning");
		
	}
}
class Demo27 {
	public static void main(String[] args) {
		Test21 t1=new Test21();
		Test31 t2=new Test31();
		t1.start();
		Thread t3=new Thread(t2);
		t3.start();
	}
	
}
