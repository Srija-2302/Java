package CDC;
class Fruits{
	void benifits() {
		System.out.println("healthy");
	}
}
class Apple extends Fruits {
	void color() {
		System.out.println("red");
	}
}
class Banana extends Apple{
	void taste() {
		System.out.println("sweet");
	}
}
class Mango extends Banana{
	void price() {
		System.out.println("150");
	}
}

public class Demo21 {
	public static void main(String[] args) {
		Apple a1=new Apple();
		Banana b1=new Banana();
		Mango m1=new Mango();
		a1.benifits();
		a1.color();
		b1.taste();
		m1.price();
		
		
	}

}
