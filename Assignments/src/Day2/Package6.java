package Day2;
class InvalidAgeException extends Exception {
	 public InvalidAgeException(String message) {
	     super(message);
	 }
	}
	class User {
	 private int age;

	 public User(int age) throws InvalidAgeException {
	     if (age <= 0) {
	         throw new InvalidAgeException("Age cannot be negative.");
	     } else if (age > 100) {
	         throw new InvalidAgeException("Age cannot be greater than 100.");
	     }
	     this.age = age;
	     System.out.println("Valid age.");
	 }
	}
	public class Package6 {
	 public static void main(String[] args) {
	     if (args.length == 0) {
	         System.out.println("Please provide age as a command line argument.");
	         return;
	     }

	     try {
	         int age = Integer.parseInt(args[0]);
	         User newUser = new User(age);
	     } catch (NumberFormatException e) {
	         System.out.println("Please enter a valid numeric age.");
	     } catch (InvalidAgeException e) {
	         System.out.println(e.getMessage());
	     }
	 }
	}

