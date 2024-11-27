import java.util.Scanner;
public class Factorial {
    public void computeFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a nonnegative integer: ");
        int input = scanner.nextInt();

        System.out.println("Factorial of " + input + " is " + factorial(input));
    }

    public long factorial(int input) {
        if (input == 0) {
            return 1;
        } else {
            return input * factorial(input - 1);
        }
    }
}
