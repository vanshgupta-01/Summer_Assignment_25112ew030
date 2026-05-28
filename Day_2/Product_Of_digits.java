package Day_2;
import java.util.Scanner;
public class Product_Of_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int product = 1;
        int temp = number;
        while (temp > 0) {
            product *= temp % 10;
            temp /= 10;
        }
        System.out.println("Product of digits of " + number + " is: " + product);
    }
}
