package model;

public class Exchange {

    private final Money amount;
    private final Currency currency;

    public Exchange(Money amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
}
