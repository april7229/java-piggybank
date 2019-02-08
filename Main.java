package com.april;

public class Main {

    public static void main(String[] args) {

        Coin dollar = new Coin(1.00);
        Coin quarter = new Coin(0.25);
        Coin penny = new Coin(0.01);
        Coin dime = new Coin(0.10);
        Coin nickel = new Coin(0.05);


        system.out.println("dollar value is " +
                dollar.getValue());

        system.out.println("quarter value is " +
                quarter.getValue());

        system.out.println("dime value is " +
                dime.getValue());    
                
        system.out.println("nickel value is " +
                nickel.getValue()); 

        system.outprint("penny value is " +
                penny.getValue());

        PiggyBank bank = new PiggyBank();

        bank.addCoins(5, dollars);
        bank.addCoins(10, quarter);
        bank.addCoins(10, dime);
        bank.addCoins(10, nickel);
        bank.addCoins(5, penny);

        double value = bank.getTotalMoney();
        int numcoins = bank.getNumberOfCoins();

        system.out.printf("Coins=%d, Value=%.2f\n", numcoins, value);
    }
}
