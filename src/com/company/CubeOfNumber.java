package com.company;

import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args){
        System.out.println("Please enter a number");
        Scanner SC =new Scanner(System.in);
        double number = SC.nextDouble();
        System.out.println((Math.pow(number,3.0)));
    }
}
