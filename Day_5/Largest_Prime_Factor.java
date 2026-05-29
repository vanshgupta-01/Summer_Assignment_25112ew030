package Day_5;
import java.util.Scanner;
public class Largest_Prime_Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its largest prime factor: ");
        long num = scanner.nextLong();

        long largestPrimeFactor = findLargestPrimeFactor(num);

        if (largestPrimeFactor != -1) {
            System.out.println("The largest prime factor of " + num + " is: " + largestPrimeFactor);
        } else {
            System.out.println(num + " has no prime factors.");
        }

        scanner.close();
    }

    private static long findLargestPrimeFactor(long n) {
        long largestFactor = -1;

        
        while (n % 2 == 0) {
            largestFactor = 2;
            n /= 2;
        }

        
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }

        if (n > 2) {
            largestFactor = n;
        }

        return largestFactor;
    }
}
