package model;

public class Exchange {

    private float numerator;
    private float denominator;

    public Exchange(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Exchange(float numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Exchange(Exchange number) {
        numerator = number.getNumerator();
        denominator = number.getDenominator();
    }

    public float getNumerator() {
        return numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    public void setNumerator(float numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(float denominator) {
        this.denominator = denominator;
    }

    public Exchange add(Exchange number) {
        Exchange result = new Exchange(0, 0);
        result.setDenominator(this.denominator * number.getDenominator());
        result.setNumerator((this.numerator * number.getDenominator()) + (number.getNumerator() * this.denominator));
        return result;
    }

    public Exchange mult(Exchange number) {
        Exchange result = new Exchange(0, 0);
        result.setNumerator(this.numerator * number.getNumerator());
        result.setDenominator(this.denominator * number.getDenominator());
        return result;
    }

    public Exchange sub(Exchange number) {
        Exchange result = new Exchange(0, 0);
        result.setDenominator(this.denominator * number.getDenominator());
        result.setNumerator((this.numerator * number.getDenominator()) - (number.getNumerator() * this.denominator));
        return result;
    }

    public Exchange div(Exchange number) {
        Exchange result = new Exchange(0, 0);
        result.setDenominator(this.denominator * number.getNumerator());
        result.setNumerator((this.numerator * number.getDenominator()));
        return result;
    }

    @Override
    public String toString() {
        return Float.toString(this.numerator);
    }
}
