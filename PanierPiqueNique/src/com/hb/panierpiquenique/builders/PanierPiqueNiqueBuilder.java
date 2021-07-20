package com.hb.panierpiquenique.builders;

import com.hb.panierpiquenique.pojos.Cadeau;
import com.hb.panierpiquenique.pojos.Panier;
import com.hb.panierpiquenique.pojos.PanierPiqueNique;

public class PanierPiqueNiqueBuilder {
    private PanierPiqueNique panierPiqueNique;

    public PanierPiqueNiqueBuilder() {
        super();
        panierPiqueNique = new PanierPiqueNique();
    }

    public PanierPiqueNiqueBuilder defineNbGuests(int nbGuests) {
        panierPiqueNique.setNbGuests(nbGuests );
        return this;
    }

    public PanierPiqueNiqueBuilder defineBasket(Panier basket) {
        panierPiqueNique.setBasket(basket);
        return this;
    }


    public PanierPiqueNiqueBuilder defineMessage(String message) {
        panierPiqueNique.setMessage(message);
        return this;
    }

    public PanierPiqueNiqueBuilder defineGift(Cadeau gift) {
        panierPiqueNique.setGift(gift);
        return this;
    }

    public PanierPiqueNique build() {
        return panierPiqueNique;
    }
}
