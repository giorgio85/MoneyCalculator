package moneycalculator;

public class Currency {

    private String code;
    private String name;
    private String symbol;

    public Currency(String code, String name, String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    public Currency(String code, String name) {
        this.code = code;
        this.name = name;
        this.symbol = "";
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof Currency) {
            return equals((Currency) object);
        }
        return false;
    }

    private boolean equals(Currency currency) {
        return this.code == currency.code;
    }

    public String toString() {
        return symbol;
    }
}
