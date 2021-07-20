package com.hb.panierpiquenique.pojos;

public class PanierPiqueNique {
    private static int sId = 1;

    protected int id;

    private int nbGuests;

    private Panier basket;

    private String message;

    private Cadeau gift;

    public PanierPiqueNique() {
        this.id = sId++;
    }

    public int getId() {
        return id;
    }

    public int getNbGuests() {
        return nbGuests;
    }

    public void setNbGuests(int nbGuests) {
        this.nbGuests = nbGuests;
    }

    public Panier getBasket() {
        return basket;
    }

    public void setBasket(Panier basket) {
        this.basket = basket;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Cadeau getGift() {
        return gift;
    }

    public void setGift(Cadeau gift) {
        this.gift = gift;
    }

    @Override
    public String toString() {
        return "PanierPiqueNique [id=" + id + ", nbGuests=" + nbGuests + ", panier=" + basket
                + ", message=" + message + ", cadeau=" + gift + "]";
    }



}
