package com.company;

public class HealtyBurger extends Hamburger {
    private String healtyExtra1Name;
    private double healtyExtra1Price;

    private String healtyExtra2Name;
    private double healtyExtra2Price;

    public HealtyBurger(String meat, double price) {
        super("Healty", meat, price, "Bron rye");
    }

    public void addHealtyAddition1(String name, double price) {
        this.healtyExtra1Name = name;
        this.healtyExtra1Price = price;
    }

    public void addHealtyAddition2(String name, double price) {
        this.healtyExtra2Name = name;
        this.healtyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healtyExtra1Name != null) {
            hamburgerPrice += this.healtyExtra1Price;
            System.out.println("Added " + this.healtyExtra1Name + " for an extra" + this.healtyExtra1Price);
        }
        if (this.healtyExtra2Name != null) {
            hamburgerPrice += this.healtyExtra2Price;
            System.out.println("Added " + this.healtyExtra2Name + " for an extra" + this.healtyExtra2Price);
        }
        return hamburgerPrice;
    }
}
