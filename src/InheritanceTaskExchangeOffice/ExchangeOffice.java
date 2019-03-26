package InheritanceTaskExchangeOffice;

import  java.lang.*;

public class ExchangeOffice{

    private Currancy[] curencies;

    public ExchangeOffice() {
        this.curencies = new Currancy[7];
    }

    public void addCurrancy(Currancy currancy){
        for (int i=0; i<curencies.length;i++){
            if(curencies[i]==null){
                curencies[i]=currancy;
                //System.out.println("Currancy added");
                break;
            }
        }

    }

    public void showFounds(){
        for (int i=0;i<curencies.length;i++){
            if(curencies[i]!=null){
                //System.out.println(curencies[i].getCurrancyInStock());
            }
        }
    }

    public void exchange(double amount,CurrancyName from,CurrancyName to){
        int fromIndex=0;
        int toIndex=0;

        for (CurrancyName valueFrom : CurrancyName.values()) {
            if (valueFrom==from){
                fromIndex=from.ordinal();
                //System.out.println("Szukany index from "+fromIndex);
            }
        }
        for (CurrancyName valueTo : CurrancyName.values()) {
            if (valueTo==to){
                toIndex=to.ordinal();
                //System.out.println("Szukany index to " + toIndex);
            }
        }

        System.out.println("Za "+amount+"  "+CurrancyName.values()[fromIndex]+" you get "+
                (CurrancyName.values()[fromIndex].getPrice()*amount)/CurrancyName.values()[toIndex].getPrice()
                +to);

    }
}
