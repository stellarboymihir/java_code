package com.mihir.introduction;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class currency {

    public static void main(String[] args) {
        double curr = 1500.00;

        Locale usa = Locale.UK;
        Locale uk = Locale.US;
        Locale ind = new Locale("en", "IN");


        Currency dollar = Currency.getInstance(usa);
        Currency poundSterling = Currency.getInstance(uk);
        Currency rupee = Currency.getInstance(ind);

        NumberFormat dollarFormatter = NumberFormat.getCurrencyInstance(usa);
        NumberFormat poundFormatter = NumberFormat.getCurrencyInstance(uk);
        NumberFormat rupeeFormatter = NumberFormat.getCurrencyInstance(ind);


        System.out.printf(dollar.getDisplayName() + ": " + dollarFormatter.format(curr) + "%n");
        System.out.println(poundSterling.getDisplayName() + ": " + poundFormatter.format(curr) + "%n");
        System.out.println(rupee.getDisplayName() + ": " + rupeeFormatter.format(curr) + "%n");
    }
}
