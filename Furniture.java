package com.tutorial;

public class Furniture {

    private String name;
    private static int price;
    private static int VAT = 1;


    public Furniture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Furniture() {

    }

    public int getPrice() {
        return price;
    }

    public static int getVAT() {
        return price + price*VAT;
    }
}
