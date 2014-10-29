package application;

import control.ExchangeOperator;
import model.CurrencySet;
import ui.ConsoleCurrencyDialog;
import ui.ConsoleMoneyDialog;
import java.io.IOException;

public class MoneyCalculator {

    public static void main(String[] args) throws IOException {
        CurrencySet currencies = CurrencySet.getInstance();
        ConsoleMoneyDialog consoleMoneyDialog = new ConsoleMoneyDialog();
        ConsoleCurrencyDialog consoleCurrencyDialog = new ConsoleCurrencyDialog();
        ExchangeOperator control = new ExchangeOperator(currencies, consoleMoneyDialog, consoleCurrencyDialog);
        control.execute();
    }
}
