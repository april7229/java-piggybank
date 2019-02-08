package com.april;

import java.util.ArrayList;

public class PiggyBank {

    private ArrayList<Coin> coinArrayList
             = new ArrayList<>();


    public int getNumberOfCoins()
    {
        return coinList.size();
    }

     public double getTotalMoney()
     {
         double sum = 0;
         for(Coin c : coinList)
         {
             sum = sum + c.getValue();
         }
         return sum;
     }

}
