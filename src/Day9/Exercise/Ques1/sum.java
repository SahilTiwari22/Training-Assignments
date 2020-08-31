package Day9.Exercise.Ques1;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Adder add = new Adder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number for addition");
        int x = sc.nextInt();
        System.out.println("Please enter second number for addition");
        int y=sc.nextInt();

        int addition = add.add(x,y);
        System.out.println("Addition of two numbers is " + addition);

    }
}

class Arithmetic {
    int sum;
    public int add(int a, int b) {
        return sum = (a + b);
    }

}

class Adder extends Arithmetic {
        }



