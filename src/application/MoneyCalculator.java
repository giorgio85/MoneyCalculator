package application;

import java.util.Calendar;
import model.Currency;
import model.CurrencySet;
import model.ExchangeRate;
import persistence.CurrencySetLoader;
import persistence.ExchangeRateLoader;

public class MoneyCalculator {

    public static void main(String[] args) {
        CurrencySet currencies = CurrencySet.getInstance();
        CurrencySetLoader.load(currencies);
        for (Currency elemento : currencies) {
            System.out.println(elemento.toString());
        }
        ExchangeRateLoader erl = new ExchangeRateLoader();
        ExchangeRate er = erl.load(Calendar.getInstance(), currencies.get("EUR"), currencies.get("COP"));
        System.out.println("rate: " + er);
    }
}

