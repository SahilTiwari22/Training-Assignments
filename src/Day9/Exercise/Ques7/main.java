package Day9.Exercise.Ques7;

import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter characters");
        char[] d = sc.next().toCharArray();
        System.out.println("Entered character sequence");
        for(int i =0 ; i<d.length;i++) {
            System.out.print(d[i]);
        }

    }
}
