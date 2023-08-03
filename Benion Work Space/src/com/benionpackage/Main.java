package com.benionpackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        float monthlyInterestRate = 0;
        int numberOfPayments = 0;

        while (true){
            System.out.print("Input The Principal ");
            principal = scanner.nextInt();
            if (principal > 1_000 && principal < 1_000_000)
                break;
            else
                System.out.println("Enter A Valid Number Between 1,000 and 1,000,000");
        }

        while (true){
            System.out.print("Input The Annual Interest Rate ");
            float annualInterestRate = scanner.nextFloat();
            if (annualInterestRate >= 1 && annualInterestRate < 30) {
                monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter A Valid Number Between 1 and 30");
        }

        while (true) {
            System.out.print("Input The Period(Years) ");
            byte years = scanner.nextByte();
            if (years >= 1 && years < 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter A Valid Value Between 1 and 30");
        }

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage Is " + mortgageFormatted);
    }
}
