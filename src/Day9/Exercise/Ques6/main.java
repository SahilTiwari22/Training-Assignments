package Day9.Exercise.Ques6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first edge of triangle");
        int a = s.nextInt();
        System.out.println("Enter the second edge of triangle");
        int b = s.nextInt();
        System.out.println("Enter the third edge of triangle");
        int c = s.nextInt();
        TriangleClass triangle = new TriangleClass(a, b, c);
        triangle.rightAngle();
    }
}
