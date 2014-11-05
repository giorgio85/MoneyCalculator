package persistence;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    public CurrencySet load() {
        CurrencySet currencySet = new CurrencySet();
        currencySet.add(new Currency("EUR", "Euro", "€"));
        currencySet.add(new Currency("GBP", "Pounds", "£"));
        currencySet.add(new Currency("USD", "USD Dollar", "$"));
        currencySet.add(new Currency("YEN", "Japanese YEN", "¥"));
        return currencySet;
    }
}
