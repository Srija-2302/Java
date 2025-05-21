package CDC;
class Movie{
	void title() {
		System.out.println("Hit");
	}
}
class Hit extends Movie{
	void theme() {
		System.out.println("Crime and Thriller");
	}
}

class Heroine extends Hit{
	void names() {
		System.out.println("sujana");
	}
}

public class Demo16 {
	public static void main(String[] args) {
		Heroine h1=new Heroine();
		Heroine h2=new Heroine();
		h1.title();
		h1.theme();
		h2.names();
		
	}

}
