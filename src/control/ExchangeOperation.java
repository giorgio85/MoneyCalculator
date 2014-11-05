package control;

import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import persistence.ExchangeRateLoader;
import ui.ExchangeDialog;
import ui.MoneyDisplay;

public class ExchangeOperation {

    private final CurrencySet currencySet;

    public ExchangeOperation(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }

    public void execute() {
        Exchange exchange = readExchange();
        ExchangeRate exchangeRate = readExchangeRate();
        Money money = calculate(exchange.getAmount(), exchangeRate);
        show(money);
    }

    private Exchange readExchange() {
        ExchangeDialog dialog = new ExchangeDialog(currencySet);
        dialog.execute();
        return dialog.getExchange();
    }

    private Money calculate(Money amount, ExchangeRate exchangeRate) {
        return new Money(amount.getAmount() * exchangeRate.getRate(), exchangeRate.getOut());
    }

    private void show(Money money) {
        new MoneyDisplay(money).execute();
    }

    private ExchangeRate readExchangeRate() {
        return new ExchangeRateLoader().load();
    }
}
