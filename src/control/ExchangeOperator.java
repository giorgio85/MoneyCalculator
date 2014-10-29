package control;

import model.CurrencySet;
import model.ExchangeRate;
import process.Exchanger;
import persistence.CurrencySetLoader;
import persistence.ExchangeRateLoader;
import ui.ConsoleCurrencyDialog;
import ui.ConsoleMoneyDialog;
import ui.MoneyDisplay;
import java.io.IOException;
import java.util.Calendar;

public class ExchangeOperator {

    private CurrencySet currencySet;
    private ConsoleMoneyDialog consoleMoneyDialog;
    private ConsoleCurrencyDialog consoleCurrencyDialog;
    private Exchanger moneyExchanger;
    private ExchangeRate exchangeRate;

    public ExchangeOperator(CurrencySet currencySet, ConsoleMoneyDialog consoleMoneyDialog, ConsoleCurrencyDialog consoleCurrencyDialog) {
        this.currencySet = currencySet;
        this.consoleMoneyDialog = consoleMoneyDialog;
        this.moneyExchanger = new Exchanger();
        this.consoleCurrencyDialog = consoleCurrencyDialog;
    }

    public void execute() throws IOException {
        loadCurrencySet(currencySet);
        consoleMoneyDialog.execute();
        consoleCurrencyDialog.execute();
        exchangeRate = loadExchangeRate();
        doMoneyExchange();
        show();
    }

    private void loadCurrencySet(CurrencySet currencySet) {
        CurrencySetLoader currencySetLoader = new CurrencySetLoader();
        currencySetLoader.load(currencySet);
    }

    private ExchangeRate loadExchangeRate() {
        ExchangeRateLoader exchangeRateLoader = new ExchangeRateLoader();
        return exchangeRateLoader.load(Calendar.getInstance(), consoleMoneyDialog.getMoney().getCurrency(), consoleCurrencyDialog.getCurrency());
    }

    private void doMoneyExchange() {
        moneyExchanger.exchange(consoleMoneyDialog.getMoney(), exchangeRate);
    }

    private void show() {
        MoneyViewer moneyViewer = new MoneyViewer();
        moneyViewer.show(moneyExchanger.getMoney());
    }
}
