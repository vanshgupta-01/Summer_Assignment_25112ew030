package Day_5;
import java.util.Scanner;
public class Factor_Of_A_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        int num = scanner.nextInt();

        System.out.println("Factors of " + num + " are:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
