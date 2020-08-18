package Day4;

import java.util.Scanner;

public class CalculateSalary {


    public static void main(String[] args) {
        CalculateSalary cs = new CalculateSalary();
        cs.UserInput();

    }

    public void UserInput() {
        int Basic, HRA, DA, Tax, salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter basic salary");
        Basic = sc.nextInt();
        System.out.println("Please enter HRA");
        HRA = sc.nextInt();
        System.out.println("Please enter DA");
        DA = sc.nextInt();
        Tax = (Basic * 15) / 100;

        salary = calculatesalarymethod(Basic, HRA, DA, Tax);
        System.out.println("Salary:"+ salary);
    }

    public int calculatesalarymethod(int Basic,int HRA,int DA,int Tax) {
        int net_salary;
        net_salary = Basic + HRA + DA - Tax;
        return net_salary;
    }
}
