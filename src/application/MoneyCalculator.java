package application;

import control.ExchangeOperation;
import persistence.CurrencySetLoader;
import model.CurrencySet;

public class MoneyCalculator {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        new ExchangeOperation(currencySet).execute();
    }
}
