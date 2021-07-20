package com.hb.panierpiquenique.pojos;

public class BouteilleDecorator  extends Panier{
    protected Panier basket;
    protected String type;

    public BouteilleDecorator() {
        super();
    }
    public BouteilleDecorator(Panier panier) {
        this();
        this.basket = panier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Panier getBasket() {
        return basket;
    }

    public void setBasket(Panier basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "BouteilleDecorator [panier=" + basket + ", type=" + type + "]";
    }
}
