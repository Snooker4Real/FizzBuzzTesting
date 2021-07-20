package com.hb.panierpiquenique.pojos;

public class Panier {
    private static int sId = 1;

    protected int id;

    protected String name;

    protected double price;

    public Panier() {
        this.id = sId ++;
    }

    public Panier(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Panier [id=" + id + ", name=" + name + ", price=" + price + "]";
    }




}
