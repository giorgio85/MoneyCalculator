package ui;

import model.CurrencySet;
import model.Exchange;
import model.Money;

public class ExchangeDialog {

    private final CurrencySet currencySet;
    private Exchange exchange;

    public ExchangeDialog(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }

    public void execute() {
        this.exchange = new Exchange(new Money(100.0, currencySet.get(null)), currencySet.get(null));
    }

    public Exchange getExchange() {
        return exchange;
    }

    public CurrencySet getCurrencySet() {
        return currencySet;
    }
}
