package com.Day3;

public class ReverseDigit {
    public static void main(String[] args){
        int a=12345; int r=0;
        while (a>0){
           int digit = a%10;
            r = r*10 + (digit);
            a=a/10;
        }
        System.out.println(r);

    }
}
