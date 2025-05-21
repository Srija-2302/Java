package CDC;

//Custom exception class for invalid employee IDs
class InvalidEmployeeIDException extends Exception {
 public InvalidEmployeeIDException(String message) {
     super(message);
 }
}

public class Demo23 {
 public static void searchEmployee(int employeeID) throws InvalidEmployeeIDException {
     if (employeeID < 0 || employeeID > 999) {
         throw new InvalidEmployeeIDException("Invalid Employee ID");
     } else {
         System.out.println("Valid Employee ID");
     }
 }

 public static void main(String[] args) {
     try {
         int employeeID = Integer.parseInt(args[0]);
         searchEmployee(employeeID);
     } catch (InvalidEmployeeIDException e) {
         System.out.println("Exception caught: " + e.getMessage());
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Please provide an employee ID as a command-line argument.");
     } catch (NumberFormatException e) {
         System.out.println("Invalid input. Please enter a valid integer.");
     }
 }
}
