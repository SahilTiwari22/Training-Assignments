package com.Day3;

public class SwitchStatement {
    public static void main(String[] args) {
        int num = 6;String Month="";
        switch (num)
        {
            case 1:
                Month = "January";
                break;
            case 2:
                Month="February";
                break;
            case 3:
                Month="March";
                break;
            case 4:
                Month="April";
            default:
                Month="None";
        }
        System.out.println(Month);
    }
    }

