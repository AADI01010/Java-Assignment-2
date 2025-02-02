package ExceptionHandling;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Division calculator");
        int a ;
        int b ;
        try {
            System.out.print("Enter First number: ");
            a = in.nextInt();
            System.out.print("Enter Second Number: ");
            b = in.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid integers.");
            return;
        }

        try {
            int res = a / b;
            System.out.println("Division of " + a + "/" + b + " = " + res);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible!");
        } finally {
            System.out.println("Execution Completed");
        }
    }
}
