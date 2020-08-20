package Day5;

import javax.swing.plaf.ColorUIResource;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Which type account you want to " +
                "open: 1 for Saving " + "\n" + "2 for Current Account ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        SBAccount sb=new SBAccount();
        sb.minbalance = 100;

        CurrentAccount ca=new CurrentAccount();
        ca.minbalance=500;


        if (choice == 1) {

        }
    }

}

abstract class Account {
    int accountnum, amount;
    String name;
    int minbalance;

    public void withdraw() {

    }

    public void deposit() {

    }
}

final class SBAccount extends Account {
    int interest = 4;
    public void deposit() {

    }
    public void withdraw() {

    }

}

final class CurrentAccount extends Account {
    public void deposit() {

    }

    public void withdraw() {

    }
}