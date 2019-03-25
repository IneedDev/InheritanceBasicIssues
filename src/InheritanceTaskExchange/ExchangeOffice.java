package InheritanceTaskExchange;

public class ExchangeOffice {
    private String name;
    private double GBP;
    private double PLN;

    public ExchangeOffice(String name) {
        this.name=name;
        this.GBP = 1000;
        this.PLN = 1000;
    }

    public void showFounds(){
        System.out.println("Current founds "+getPLN()+" PLN "+getGBP()+" GBP");
    }

    public void exchange(double amount, Currency from, Currency to){


    }

    public double getGBP() {
        return GBP;
    }

    public void setGBP(double GBP) {
        this.GBP = GBP;
    }

    public double getPLN() {
        return PLN;
    }

    public void setPLN(double PLN) {
        this.PLN = PLN;
    }
}
