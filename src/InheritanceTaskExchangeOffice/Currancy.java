package InheritanceTaskExchangeOffice;

public class Currancy {

    private CurrancyName name;
    private double currancyRatetoUsd;
    private double currancyInStock;

    public Currancy(CurrancyName name, double currancyRatetoUsd, double currancyInStock) {
        this.name = name;
        this.currancyRatetoUsd = currancyRatetoUsd;
        this.currancyInStock = currancyInStock;
    }

    public CurrancyName getName() {
        return name;
    }

    public void setName(CurrancyName name) {
        this.name = name;
    }

    public double getCurrancyRatetoUsd() {
        return currancyRatetoUsd;
    }

    public void setCurrancyRatetoUsd(double currancyRatetoUsd) {
        this.currancyRatetoUsd = currancyRatetoUsd;
    }

    public double getCurrancyInStock() {
        return currancyInStock;
    }

    public void setCurrancyInStock(double currancyInStock) {
        this.currancyInStock = currancyInStock;
    }
}
