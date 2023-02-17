package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number");
        int num1 = input.nextInt();

        System.out.println("please enter the second number");
        int num2 = input.nextInt();

        System.out.println("please enter +,/,*,-");
        String operation = input.next();

        if (operation.equals("+"))
        {
            System.out.println("your answer is " + (num1 + num2));
        }
        if (operation.equals("-"))
        {
            System.out.println("your answer is " + (num1 - num2));
        }
        if (operation.equals("/"))
        {
            System.out.println("your answer is " + (num1 / num2));
        }
        if (operation .equals( "*"))
        {
            System.out.println("your answer is " + (num1 * num2));
        }
        else{
            System.out.println("Wrong Operation");
        }


    }
}