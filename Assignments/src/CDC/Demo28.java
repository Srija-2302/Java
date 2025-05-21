package CDC;
class Test34 extends Thread{
	public void run() {
		System.out.println("Good morning");
	}
}
class Test001 extends Test34 {
	public void run() {
		System.out.println("good afternoon");
	}
}
class Test5 implements Runnable{
	public void run() {
		System.out.println("hello");
		
	}
}
class Test003 extends Test5{
	public void run() {
		System.out.println("Sujana");
	}
	
}

class Demo28{
	public static void main(String[] args) {
		Test001 t1=new Test001();
		Test34 t2=new Test34();
		Test5 t3=new Test5();
		Test003 t4=new Test003();
		t1.start();
		t2.start();
		Thread t5=new Thread(t3);
		t5.start();
		Thread t7=new Thread(t4);
		t7.start();
		
		
	}
	
}