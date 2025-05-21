package Day2;

import java.util.Scanner;

public class Practice5 {

    public static void recordScore(String name, String scoreStr) {
        try {
            if (name == null || name.trim().isEmpty()) {
                throw new NullPointerException("Name cannot be null or empty.");
            }

            int score = Integer.parseInt(scoreStr);

            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Score must be between 0 and 100.");
            }

            System.out.println("The score has been successfully recorded.");

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: The score is not a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student's score: ");
        String score = scanner.nextLine();

        recordScore(name, score);

        
    }
}

