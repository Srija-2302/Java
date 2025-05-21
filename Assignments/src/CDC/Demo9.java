package CDC;
import java.util.*;
public class Demo9 {
	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();///three
		l1.add(12);
		l1.add("hi");
		l1.add(67);
		ArrayList<Object> l2=new ArrayList<Object>(l1);
		l2.add(12);
		l2.add(45);
		l2.add(67);
		l2.addAll(l1);
		l1.add(null);
		System.out.println(12);
	}

}
