package com.april;

import java.util.ArrayList;


public class PiggyBank {

    private ArrayList<Coin> coinList
            = new ArrayList<>();

    final int MAX_COINS = 50;

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

    public int addCoins(int howmany, Coin c){

        int added = 0;

        while (added < howmany)
        {
            added +=1;
            coinList.add(c);
        }
        return added;

    }

}
