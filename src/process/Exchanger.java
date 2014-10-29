package process;

import model.ExchangeRate;
import model.Money;

public class Exchanger {

    private Money money;

    public void exchange(Money money, ExchangeRate exchangeRate) {
        this.money = new Money(money.getAmount().multiply(exchangeRate.getRate()), exchangeRate.getToCurrency());
    }

    public Money getMoney() {
        return money;
    }
}
