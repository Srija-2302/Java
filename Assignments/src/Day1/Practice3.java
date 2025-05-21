package Day1;
interface Student{
	void Topper();
}
class Person{
	void name() {
		System.out.println("Name: Srija");
	}
	void score() {
		System.out.println("She can score 90%");
	}
}
class Lecture extends Person implements Student {
	public void Topper() {
		System.out.println("She is attending a english Lectures");
	}
	
}
class Faculty extends Lecture{
	public void start() {
		System.out.println("Faculty Starts a lecture now");
	}
}
public class Practice3 {
	public static void main(String[] args) {
		Faculty f1=new Faculty();
		f1.Topper();
		f1.name();
		f1.score();
		f1.start();
	}

}
