package model;

import java.util.Date;

public class ExchangeRate {

    private final Currency in;
    private final Currency out;
    private double rate;
    private Date date;

    public ExchangeRate(Currency in, Currency out, double rate) {
        this.in = in;
        this.out = out;
        this.rate = rate;
    }

    public ExchangeRate(Currency in, Currency out, double rate, Date date) {
        this.in = in;
        this.out = out;
        this.rate = rate;
        this.date = date;
    }

    public Currency getIn() {
        return in;
    }

    public Currency getOut() {
        return out;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
