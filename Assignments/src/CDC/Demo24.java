package CDC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the value of 'a': ");
                int a = scanner.nextInt();
                System.out.print("Enter the value of 'b': ");
                int b = scanner.nextInt();

                int result = divide(a, b);
                System.out.println("Result of a/b: " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Input Mismatch Exception: Please enter valid integer values.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return a / b;
    }
}