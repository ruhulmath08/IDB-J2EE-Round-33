package declarefield;

import java.util.Date;

public class Stock {
    String symbol;
    double price;
    Date date;

    public Stock(String symbol, double price, Date date) {
        this.symbol = symbol;
        this.price = price;
        this.date = date;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    
    
}
