package InheritanceTaskExchangeOffice;

public enum CurrancyName {
    PLN (0.263,"PLN"),
    GBP(0.263,"GBP"),
    JPY(0.263,"JPY"),
    EUR(1.131,"EUR"),
    RUB(0.263,"RUB"),
    CZK(0.263,"CZK"),
    USD(0.263,"USD");

    private double price;
    private String name;

    CurrancyName(double price,String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
