package utilities;
import java.util.Scanner;
class NegativeNumberException extends Exception {
    NegativeNumberException(String message) {
        super(message);
    }
}
public class NegativeNumException {
    public static int fact() throws NegativeNumberException {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number you want factorial of:- ");
        n = in.nextInt();
        try {
            if (n < 0) {
                throw new NegativeNumberException("Negative Number Entered!!...Exiting!");
            }
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            return -1;
        }
        int fac = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                fac *= i;
            }
        }

        return fac;
    }

    public static void main(String[] args) throws NegativeNumberException {
        int res = fact();
        if (res != -1) {
            System.out.println("The Factorial of the Number:- " + res);
        }
    }
}
