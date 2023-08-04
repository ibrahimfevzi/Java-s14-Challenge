package com.workintech.burger.entity;

public class DeluxeBurger extends Hamburger {

    private String drink;
    private String chips;

    public DeluxeBurger(String name, String breadRollType, double price, String drink, String chips, String meat) {
        super(name,  19.1, breadRollType, meat);
        this.drink = drink;
        this.chips = chips;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
