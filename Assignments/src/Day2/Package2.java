package Day2;

class EmployeeSearchSystem extends Exception{
	EmployeeSearchSystem(String Message){
		super(Message);
	}
}

public class Package2 {
	public static void employeeid(int a) throws EmployeeSearchSystem{
		if(a<0||a>999) {
			throw new EmployeeSearchSystem("Exception Caught invalid employee id");
		}
		else
		{
			System.out.println("Valid Employee Id");
		}
	}

	public static void main(String[] args) {
		try {
			if(args.length==0) {
				System.out.println("Enter the value");
			}else {
			int id = Integer.parseInt(args[0]); 
			 employeeid(id);
			}
			 
		}catch(EmployeeSearchSystem e) {
			System.out.println(e.getMessage());
		}

	}

}
