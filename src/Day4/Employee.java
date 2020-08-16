package Day4;
/**
 * This function takes the input from user and calculates if employee is eligible for Pension or Not
 */
import java.util.Scanner;

public class Employee {
    static String employee_name;
    static int age;

    public static void main(String[] args){

        System.out.println("Please enter name of employee");
        Scanner sc = new Scanner(System.in);
        employee_name = sc.nextLine();
        System.out.println("Please enter age of employee");
        age = sc.nextInt();

        if(age<55){
            System.out.println(employee_name+" is not eligible for pension");
        }else{
            System.out.println(employee_name+" is eligible for pension");
        }
    }
}
