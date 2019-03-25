package InheritanceTaskExchange;

import InheritanceTaskCalories.Dish;
import InheritanceTaskCalories.MenuDishes;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void menu(){

        ExchangeOffice kantor1 = new ExchangeOffice("Kantor 1");
        int caseNumbers=0;
        //while will exit if caseNumber = 4
        while (caseNumbers!=5){
            System.out.println("1. Exchange money");
            System.out.println("2. Show founds");
            String caseNumberString = scanner.nextLine();
            int caseNumber = Integer.parseInt(caseNumberString);
            switch (caseNumber){
                case 1:
                    System.out.println("Choose curancy");
                    String name = scanner.nextLine();
                    System.out.println("Give amount");
                    String StringAmount = scanner.nextLine();
                    int amount = Integer.parseInt(StringAmount);
                   // kantor1.exchange();

                    break;
                case 2:
                    kantor1.showFounds();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default :
                    System.out.println("Niepoprawny input");
                    break;
            }

        }
    }
}
