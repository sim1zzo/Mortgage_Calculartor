package com.sim1zzo.java2;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private  MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.currency = NumberFormat.getCurrencyInstance();
        this.calculator = calculator;
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(var balance : calculator.getRemainingBalances())
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
