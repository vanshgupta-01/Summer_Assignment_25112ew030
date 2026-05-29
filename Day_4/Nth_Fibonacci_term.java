package Day_4;
import java.util.Scanner;
public class Nth_Fibonacci_term {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the term number to find in the Fibonacci series: ");
        int n = scanner.nextInt();

        int a = 0, b = 1, nthTerm = 0;

        if (n == 1) {
            nthTerm = a;
        } else if (n == 2) {
            nthTerm = b;
        } else {
            for (int i = 3; i <= n; i++) 
            {
                nthTerm = a + b;
                a = b;
                b = nthTerm;
            }
        }

        System.out.println("The " + n + "rd term in the Fibonacci series is: " + nthTerm);
    }
}
