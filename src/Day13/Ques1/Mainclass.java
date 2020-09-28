package Day13.Ques1;

import java.util.Scanner;

public class Mainclass {

    public static void main(String args[]) {
        System.out.println("Enter any number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.close();
        PrimeNumber pn = new PrimeNumber();
        pn.checkPrimeNumbers(a);

    }
}
