package com.main.converter;

import java.util.ArrayList;
import java.util.List;

public class Converter {

    private final double usd;

    private final double eur;

    private final double rub;

    public Converter(double usd, double eur, double rub) {
        this.usd = usd;
        this.eur = eur;
        this.rub = rub;
    }

    public double convertFromUah(double uahSum, String to) {
        switch (to) {
            case "usd" -> uahSum /= 38;
            case "eur" -> uahSum /= 39;
            case "rub" -> uahSum /= 0.6;
        }
        return uahSum;
    }

    public List<Double> convertToUah(List<String> currencies) {
        var result = new ArrayList<Double>(3);
        for (String currency : currencies) {
            if (currency.equalsIgnoreCase("usd")) {
                result.add(usd * 38);
            } else if (currency.equalsIgnoreCase("eur")) {
                result.add(eur * 39);
            } else if (currency.equalsIgnoreCase("rub")) {
                result.add(rub * 0.6);
            }
        }
        return result;
    }
}

