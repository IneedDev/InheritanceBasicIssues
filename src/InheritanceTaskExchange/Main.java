package InheritanceTaskExchange;

public class Main {

    public static void main(String[] args) {

        ExchangeOffice kantor1 = new ExchangeOffice("Kantor 1");
        kantor1.getGBP();
        kantor1.getPLN();

        System.out.println(kantor1.getGBP());
        kantor1.showFounds();

    }
}
