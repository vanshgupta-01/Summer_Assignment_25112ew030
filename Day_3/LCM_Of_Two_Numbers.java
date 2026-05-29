package Day_3;
import java.util.Scanner;
public class LCM_Of_Two_Numbers {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int a =num1;
        int b =num2;
 
       while(num2 != 0)
       {
        int remainder = num1 % num2;
        num1 = num2;
        num2 = remainder;
       }
       int gcd=num1;
       int lcm=(a*b)/gcd;

        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm);
    }
}
