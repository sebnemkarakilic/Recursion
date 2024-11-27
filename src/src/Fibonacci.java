import java.util.Scanner;

public class Fibonacci {
    public void computeFibonacci() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = scan.nextInt();

        System.out.println("The Fibonacci number at index " + index + " is " + fibonacci(index));
    }

    public long fibonacci(int index) {
        if (index == 0) return 0;
        if (index == 1) return 1;
        else
            return fibonacci(index - 1) + fibonacci(index - 2);
    }
}