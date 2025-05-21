package Day1;
interface Dhoni{
	void Captain();
}
interface Bumra{
	void Bowler();
}
interface Cricket extends Dhoni,Bumra{
	void Cricketers();
}
public class Practice1 implements Cricket {
	public void Captain() {
		System.out.println("Leads the team");
	}
	public void Bowler() {
		System.out.println("Delivers ball to batsmen");
		
	}
	public void Cricketers() {
		System.out.println("both are friends");
	}
	public void ground() {
		System.out.println("both are cricketers");
	}
	public static void main(String[] args) {
		Practice1 p1=new Practice1();
		p1.Captain();
		p1.Bowler();
		p1.Cricketers();
		p1.ground();
		
	}

}
