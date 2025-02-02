package utilities;
@FunctionalInterface
interface Calculator{
    int calc(int a,int b);
}
public class TestCalculator {
    public static void main(String[] args) {
        Calculator sum = (int x, int y) -> x+y;
        int a1= sum.calc(10,10) ;
        Calculator sub = (int x, int y) -> x-y;
        int a2 =sub.calc(10,10);
        Calculator mul = (int x, int y) -> x*y;
        int a3 = mul.calc(10,10);
        System.out.println("The Addition of Two number is:- "+a1);
        System.out.println("The Subtraction of Two number is:- "+a2);
        System.out.println("The Multiplication of Two number is:-"+a3);
    }
}
