package Day_4;
import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int sum = 0;
        int n = String.valueOf(num).length();

        while (num != 0) 
        {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        if (sum == originalNum) 
        {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
