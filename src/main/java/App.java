/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String Num1 = myApp.readPrinciple();
        String Num2 = myApp.readRate();
        String Num3 = myApp.readYears();
        int principle = Integer.parseInt(Num1);
        double rate = Double.parseDouble(Num2);
        int years = Integer.parseInt(Num3);
        double convertRate = myApp.convertRate(rate);
        double finalInterest = myApp.calcInterest(principle, convertRate, years);
        String outputString = myApp.generateOutputString(years, rate, finalInterest);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readPrinciple(){
        System.out.print("Enter the principal: ");
        return in.nextLine();
    }

    public String readRate(){
        System.out.print("Enter the rate of interest: ");
        return in.nextLine();
    }

    public String readYears(){
        System.out.print("Enter the number of years: ");
        return in.nextLine();
    }

    public double convertRate(double rate){
        return (rate/100);
    }

    public double calcInterest(int principle, double rate, int years){
        return (principle * (1 + (rate * years)));
    }

    public String generateOutputString(int years, double convertRate, double finalInterest){
        return String.format("After %s years at %s%%, the investment will be worth $%.2f.", years, convertRate, finalInterest);
    }
}