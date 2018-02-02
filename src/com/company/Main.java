package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


// Welcome User "hello! Please enter your name".
// Use a scanner to allow user entry
// Ask for user to enter age
// ask user for current year
// Name should be outputted with age after 5 years and 10 years

        System.out.println("Hello!");
        Boolean ask = true;
        Scanner robot = new Scanner(System.in);
        while(ask){
            String[] questions = {
                    "Please enter your name:",
                    "Please enter your current age:",
                    "Please enter current year:"
            };

            List<String> answers = new ArrayList<>();

            for(int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                String userEntry = robot.nextLine();
                answers.add(userEntry);

            }

            String nameString = answers.get(0);
            String ageString = answers.get(1);
            String yearString = answers.get(2);

            int age = Integer.parseInt(ageString);
            int year = Integer.parseInt(yearString);

            System.out.println(nameString + ", you are currently " + age + " years old.");

            int oneYear = year + 1;
            int fiveYear = year + 5;
            int tenYear = year + 10;

            int oneAge = age + 1;
            int fiveAge = age + 5;
            int tenAge = age + 10;



            System.out.println("In " + oneYear + " you will be " + oneAge + " years old.");
            System.out.println("In " + fiveYear + " you will be " + fiveAge + " years old.");
            System.out.println("In " + tenYear + " you will be " + tenAge + " years old.");

            System.out.println(nameString + ", would you like to enter a different name and age?");

            String userResponse = robot.nextLine();
            if(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")){
                ask = true;
            } else {
                ask = false;
            }
            System.out.println("Have a nice day!");
        }

    }
}
