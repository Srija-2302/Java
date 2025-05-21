package CDC;
import java.util.*;
public class Collect1 {
	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();///three
		l1.add(12);
		l1.add(34);
		l1.add(67);
		l1.add(2,67);
		System.out.println(l1);
		List<Object> extra=Arrays.asList(9,89,90);
		l1.addAll(1,extra);
		System.out.println(l1.get(6));
		System.out.println(l1.indexOf(90));
		Object[] arr=l1.toArray();
		for(Object a1:arr) {
			System.out.println(a1);
		}
	}

}
