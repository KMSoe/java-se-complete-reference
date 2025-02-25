package com.kaungmyat.javase.chapter21;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {
    public static void main(String[] args) {
        Currency currency = Currency.getInstance(Locale.US);
        System.out.println("Symbol: " + currency.getSymbol());
        System.out.println("Fraction: " + currency.getDefaultFractionDigits());
    }
}
