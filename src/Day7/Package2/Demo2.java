package Day7.Package2;
import Day7.Package1.Demo1;

public class Demo2 {
    public static void main(String[] args) {
        int result;
        Demo1 d1 = new Demo1();
        result= d1.divide(12,3);
        System.out.println("Division is: " + result);
        result= d1.factorial(5);
        System.out.println("Factorial is: " + result);
        result= d1.multiply(3,6);
        System.out.println("Multiplication is: " + result);
        result= d1.reverse(1234);
        System.out.println("Reversal is: " + result);
        result= d1.subtraction(8,3);
        System.out.println("Subtraction is: " + result);

    }
}
