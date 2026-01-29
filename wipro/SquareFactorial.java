import java.util.Scanner;

public class SquareFactorial {

    // Method to find square
    static int square(int n) {
        return n * n;
    }

    // Method to find factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Square: " + square(num));
        System.out.println("Factorial: " + factorial(num));
    }
}
