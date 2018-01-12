package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRCalculatorSolver {

    public static void main(String[] args) {

        //HR Team User
        //X-Great User
        //?-Tell them how it works - Use for end user
        //X-User enters info
        //X- first name
        //X- Last name
        //X- employe number
        //X- Annual salary
        // X-Salary breakdwon
        // X- monthly - paid 12 times
        // X-Twice a month - paid 24 times
        // X-every two weeks - paid 26 times
        // X-ask user if another employee?
        //X- if yes, repeat
        // X- if no, close

        Boolean ask = true;
        Scanner robot = new Scanner(System.in);


            System.out.println("Welcome to the HR application.");
            System.out.println("We break down employee annual salary into monthly, biMonthly, and biWeakly payments");

            while(ask) {

                String[] questions = {
                    "Please enter First Name:",
                    "Please enter Last Name:",
                    "Please enter employee Number:",
                    "Please enter salary:"
            };

            List<String> answers = new ArrayList<>();


            for(int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                String userEntry = robot.nextLine();
                answers.add(userEntry);
            }

//            System.out.println(answers.get(0));
//            System.out.println(answers.get(1)); //used just to make sure you are recording the information
//            System.out.println(answers.get(2));
//            System.out.println(answers.get(3));
            String firstNameString = answers.get(0);
            String salaryString = answers.get(3);
            int salary = Integer.parseInt(salaryString);


//            Scanner robot = new Scanner(System.in);
//            System.out.println("Please enter first name");
//            String firstName = robot.nextLine();
//            System.out.println("Please enter last Name");
//            String lastName = robot.nextLine();
//            System.out.println("Please enter employee Number");
//            String employeeNumber = robot.nextLine();
//            System.out.println("Please enter salary");
//            String salary = robot.nextLine();



            int monthlySalary = salary/ 12;
            int twiceMonthSalary = salary/ 24;
            int everyTwoWeeksSalary = salary/ 26;

            System.out.println("monthly Salary: " + monthlySalary);
            System.out.println("monthly Salary: " + twiceMonthSalary);
            System.out.println("monthly Salary: " + everyTwoWeeksSalary);

            System.out.println(firstNameString + ", would you like to enter another employee?");
            String responseFromUser = robot.nextLine();
            if(responseFromUser.equalsIgnoreCase("yes") || responseFromUser.equalsIgnoreCase("y")){
                ask = true;
            } else {
                ask = false;
            }

        }
    }
}
