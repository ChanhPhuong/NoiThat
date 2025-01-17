package com.example.noithat.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class StringHelper {
    public static String currencyFormat(double price){
        Locale loc = Locale.getDefault();
        NumberFormat nf = NumberFormat.getCurrencyInstance(loc);
        return nf.format(price);
    }
}
