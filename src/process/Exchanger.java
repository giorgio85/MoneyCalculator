package process;

import model.ExchangeRate;
import model.Money;

public class Exchanger {

    private ExchangeRate exchangeRate;
    private Money money;

    public void exchange() {
        calculate(money, exchangeRate);
    }

    private Money calculate(Money money, ExchangeRate exchangeRate) {
        return new Money(money.getAmount() * exchangeRate.getRate(), exchangeRate.getOut());
    }
}
