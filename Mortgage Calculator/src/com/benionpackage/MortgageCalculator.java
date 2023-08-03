package com.benionpackage;

import java.text.NumberFormat;

public class MortgageCalculator {
    int principal;
    float monthlyInterestRate;
    int numberOfPayments;
    String mortgage;

    MortgageCalculator(int principal, float monthlyInterestRate, int numberOfPayments) {
        System.out.println("<<<<<< Mortgage Calculator Constructed >>>>>>>");
        this.principal = principal;
        this.monthlyInterestRate = monthlyInterestRate;
        this.numberOfPayments = numberOfPayments;
    }

    public void calculateMortgage() {
        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        this.mortgage = mortgageFormatted;
    }

    public void displayMortgage() {
        calculateMortgage();
        System.out.println("Your Mortgage Is " + mortgage);
    }
}
