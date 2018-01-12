package com.company;

import java.util.Scanner;

public class WeekendChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input First Number:");
        String firstNumber = sc.nextLine();

        System.out.println("Input one of the following valid operators: +, -, *, / :");
        String operator = sc.nextLine();

        System.out.println("Input Second Number:");
        String secondNumber = sc.nextLine();

        int intFirst = Integer.parseInt(firstNumber);
        int intSecond = Integer.parseInt(secondNumber);
        int intResult = 0;

        if(operator.equals("+") || operator.equals("add")){
            intResult = intFirst + intSecond;
        } else if (operator.equals("-") || operator.equals("subtract")){
            intResult = intFirst - intSecond;
        } else if (operator.equals("*") || operator.equals("multiply")){
            intResult = intFirst * intSecond;
        } else if (operator.equals("/") || operator.equals("divide")){
            intResult = intFirst / intSecond;


        }

        System.out.println("Your number is: " + intResult);
    }
}
