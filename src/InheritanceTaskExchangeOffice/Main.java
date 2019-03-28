package InheritanceTaskExchangeOffice;

public class Main {

    public static void main(String[] args) {

        ExchangeOffice exchangeOffice = new ExchangeOffice();

        Currancy pln = new Currancy(CurrancyName.PLN,1000);
        Currancy gbp = new Currancy(CurrancyName.GBP,1000);
        Currancy eur = new Currancy(CurrancyName.EUR,1000);
        Currancy jpy = new Currancy(CurrancyName.JPY,1000);
        Currancy czk = new Currancy(CurrancyName.CZK,1000);
        Currancy rub = new Currancy(CurrancyName.RUB,1000);

        exchangeOffice.addCurrancy(pln);
        exchangeOffice.addCurrancy(gbp);
        exchangeOffice.addCurrancy(eur);
        exchangeOffice.addCurrancy(jpy);
        exchangeOffice.addCurrancy(czk);
        exchangeOffice.addCurrancy(rub);

        exchangeOffice.currencyInStockUpdate(pln);



       new Menu().menu();


    }
}
