package com.april;

public class Main {

    public static void main(String[] args) {

        Coin dollar = new Coin(1.00);
        Coin quarter = new Coin(0.25);
        Coin penny = new Coin(0.01);
        Coin dime = new Coin (0.10);
        Coin nickel= new Coin (0.05);

        System.out.println("quarter value is " +
                quarter.getValue());

        System.out.println("dollar value is " +
                dollar.getValue());


        System.out.println("penny value is " +
                penny.getValue());

        System.out.println("nickel value is " +
                nickel.getValue());

        System.out.println("dime value is " +
                dime.getValue());

        PiggyBank bank = new PiggyBank();

        bank.addCoins(5, dollar);
        bank.addCoins(10, quarter);
        bank.addCoins(7, dime);
        bank.addCoins(3, nickel);
        bank.addCoins(10, penny);

        double value = bank.getTotalMoney();
        int numcoins = bank.getNumberOfCoins();

        System.out.printf("Coins=%d, Value=%.2f\n",
                numcoins, value);
    }
}
