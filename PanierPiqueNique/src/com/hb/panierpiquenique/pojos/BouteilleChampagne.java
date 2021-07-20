package com.hb.panierpiquenique.pojos;

public class BouteilleChampagne extends BouteilleDecorator {
    public BouteilleChampagne() {
        super();
        this.setType("bouteille de Champagne");
        this.setPrice(30);
    }
}
