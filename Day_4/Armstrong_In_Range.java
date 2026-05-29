package Day_4;

import java.util.Scanner;

public class Armstrong_In_Range {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers are:");

        for (int i = start; i <= end; i++) {

            int num = i;
            int original = i;
            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum = sum + (digit * digit * digit);
                num = num / 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }

        scanner.close();
    }
}