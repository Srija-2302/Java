package CDC;

import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a colour");
		String colour=sc.next();
		switch(colour) {
		case "red":
			System.out.println("celebrate holi");
			break;
		case "green":
			System.out.println("celebrate ramzan");
			break;
		case "white":
			System.out.println("celebrate christmas");
			break;
		default:
			System.out.println("no festival");
		}
	}

}
