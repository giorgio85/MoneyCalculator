package moneycalculator.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CurrencySet extends HashSet<Currency> {

    private static CurrencySet sInstance;

    private CurrencySet() {
        super();
    }

    public static CurrencySet getInstance() {
        if (sInstance == null) {
            sInstance = new CurrencySet();
        }
        return sInstance;
    }

    public String[] getArray() {
        CurrencySet currencySet = getInstance();
        String[] currencies = new String[currencySet.size()];
        int i = 0;
        for (Currency currency : currencySet) {
            currencies[i++] = currency.getCode();
        }
        Arrays.sort(currencies);
        return currencies;
    }

    public Currency getFromCode(String code) {
        for (Currency currency : this) {
            if (code.equals(currency.getCode())) {
                return currency;
            }
        }
        return null;
    }

    public Currency[] search(String token) {
        ArrayList<Currency> result = new ArrayList<>();
        for (Currency currency : this) {
            if (currency.getCode().equalsIgnoreCase(token)) {
                result.add(currency);
            } else if (currency.getSymbol().equalsIgnoreCase(token)) {
                result.add(currency);
            } else if (currency.getName().toLowerCase().contains(token.toLowerCase())) {
                result.add(currency);
            }
        }
        return result.toArray(new Currency[0]);
    }
}