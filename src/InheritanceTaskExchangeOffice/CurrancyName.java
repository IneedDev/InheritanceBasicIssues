package InheritanceTaskExchangeOffice;

public enum CurrancyName {
    PLN (0.263,"PLN",1000),
    GBP(1.296,"GBP",1000),
    JPY(0.0090,"JPY",1000),
    EUR(1.131,"EUR",1000),
    RUB(0.01,"RUB",1000),
    CZK(0.0426,"CZK",1000),
    USD(1,"USD",1000);

    private double price;
    private String name;
    private double inStock;

    CurrancyName(double price, String name, double inStock) {
        this.price = price;
        this.name = name;
        this.inStock = inStock;
    }

    public double getInStock() {
        return inStock;
    }

    public void setInStock(double inStock) {
        this.inStock = inStock;
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
