package Day4;
/*
 *Program which takes input from customer for withdrawal or deposit of money
 *  and shows the after operation amount
 */

import java.util.Scanner;

public class BankDetail {
    int TotalBalance=100;

    public static void main(String[] args) {
        BankDetail bankdetail = new BankDetail();
        System.out.println("Choose from below options:" + '\n' + "1 : For Deposit" + '\n' + "2: For Withdrawal");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1) {
            bankdetail.DepositMoney();
        } else {
            bankdetail.WithdrawMoney();
        }
    }

    public void DepositMoney() {
        int DepositMoney;
        System.out.println("Please Enter the amount to be deposited");
        Scanner sc = new Scanner(System.in);
        DepositMoney = sc.nextInt();

        TotalBalance = TotalBalance + DepositMoney;
        System.out.println("Your New balance is:" + TotalBalance);

    }

    public void WithdrawMoney() {
        int WithdrawalMoney;
        System.out.println("Please Enter the amount to withdraw");
        Scanner sc = new Scanner(System.in);
        WithdrawalMoney = sc.nextInt();
        if (TotalBalance < WithdrawalMoney) {
            System.out.println("Not enough balance in your account");
        } else {
            TotalBalance = TotalBalance - WithdrawalMoney;
            System.out.println("Remaining amount in your account:" + TotalBalance);
        }
    }
}
