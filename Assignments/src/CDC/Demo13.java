package CDC;

public class Demo13 {
	int SSC;
	int Inter;
	int Btech;
	public Demo13() {
		System.out.println("Welcome to my profile");
		
	}
	public Demo13(int SSC) {
		this.SSC=SSC;
		System.out.println(SSC);
		}
	public Demo13(int SSC,int Inter) {
		this.SSC=SSC;
		this.Inter=Inter;
		System.out.println(SSC+Inter);
	}
	public Demo13(int SSC,int Inter,int Btech) {
		this.SSC=SSC;
		this.Inter=Inter;
		this.Btech=Btech;
		System.out.println(SSC+Inter+Btech);
		
		
	}
	public static void main(String[] args) {
		Demo13 d1=new Demo13();
		Demo13 d2=new Demo13(456);
		Demo13 d3=new Demo13(456,889);
		Demo13 d4=new Demo13(456,889,789);
	}
	
}
