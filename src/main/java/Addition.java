import java.util.Scanner;

/**
 * Simple Java program that adds two integers.
 */
public class Addition {
    public static int add(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first integer: ");
            int first = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int second = scanner.nextInt();

            System.out.println(" trigger ");
        }
    }
}
