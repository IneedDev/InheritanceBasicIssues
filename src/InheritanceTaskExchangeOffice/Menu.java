package InheritanceTaskExchangeOffice;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void menu(){

        ExchangeOffice exchangeOffice = new ExchangeOffice();
        int caseNumbers=0;
        while (caseNumbers!=2){
            System.out.println("1. Exchange money");
            System.out.println("2. Exchange office founds");
            String caseNumberString = scanner.nextLine();
            int caseNumber = Integer.parseInt(caseNumberString);
            switch (caseNumber){
                case 1:
                    System.out.println("Exchange money");
                    System.out.println("------------------------");
                    System.out.println("Give amount");
                    String amountString = scanner.nextLine();
                    double amount =  Double.parseDouble(amountString);
                    System.out.println("------------------------");
                    System.out.println("from what currency");
                    String from = scanner.nextLine();

                    System.out.println("------------------------");
                    System.out.println("to what currency");
                    String to = scanner.nextLine();

                    exchangeOffice.exchange(amount,CurrancyName.valueOf(from.toUpperCase()),CurrancyName.valueOf(to.toUpperCase()));
                    break;
                case 2:
                    System.out.println("Show founds");
                    break;
                case 3:
                    System.out.println("Exit");
                    return;
                    default:
                        System.out.println("Wrong input");
                        break;

            }

        }
    }


}
