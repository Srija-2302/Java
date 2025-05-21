package Day2;


import java.util.Scanner;

public class Package4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer as a string: ");
        String input = scanner.nextLine();

        try {
            int parsedInteger = Integer.parseInt(input);
            System.out.println("Parsed integer: " + parsedInteger);
        } catch (NumberFormatException e) {
            System.out.println("Error: The input is not a valid integer.");
        } finally {
            System.out.println("Code Executed Succesfully");
        }
    }
}