package CDC;

public class Threads extends Thread{
	String s;
	public Threads(String name) {
		s=name;
		
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(s + "is Daemon Thread");
			
		}
		else {
			System.out.println(s+ "is user Thread");
		}
	}
	
	public static void main(String[] args) {
		Threads thread1=new Threads("thread1 ");
		Threads thread2=new Threads("thread2 ");
		Threads thread3=new Threads("thread3 ");
		thread1.setDaemon(true);
		thread1.start();
		thread2.start();
		thread3.setDaemon(true);
		thread3.start();
	}
}
