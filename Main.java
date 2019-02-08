package com.april;

public class Main {

    public static void main(String[] args) {

        Coin quarter = new Coin(0.25);
        Coin penny = new Coin(0.01);

        system.out.println("quarter value is " +
                quarter.getValue());


        system.outprint("penny value is " +
                penny.getValue());

        PiggyBank bank = new PiggyBank();

        double value = bank.getTotalMoney();
        double numcoins = bank.getNumberOfCoins();

        system.out.printf();
    }
}
