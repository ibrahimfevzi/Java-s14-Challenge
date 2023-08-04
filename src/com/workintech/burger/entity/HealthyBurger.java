package com.workintech.burger.entity;

public class HealthyBurger extends Hamburger {

    public HealthyBurger(String name, String breadRollType,  double price, String meat) {
        super(name,  price, breadRollType, meat);
    }

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }


    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            System.out.println("HealthyAddition1: " + this.healthyExtra1Name);
            totalPrice += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            System.out.println("HealthyAddition2: " + this.healthyExtra2Name);
            totalPrice += this.healthyExtra2Price;
        }
        System.out.println("Price: " + totalPrice);
        return totalPrice;
    }
}
