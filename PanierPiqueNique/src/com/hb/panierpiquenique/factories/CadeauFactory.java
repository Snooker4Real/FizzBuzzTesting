package com.hb.panierpiquenique.factories;

import java.util.concurrent.ThreadLocalRandom;

import com.hb.panierpiquenique.pojos.Cadeau;

public class CadeauFactory {

    private  static CadeauFactory instance;

    private CadeauFactory() {

    }

    public final static CadeauFactory getInstance() {
        if(instance == null) {
            //check thread safe
            synchronized (CadeauFactory.class) {
                if (instance == null) {
                    instance = new CadeauFactory();
                }
            }
        }
        return instance;
    }

    public Cadeau generateCadeau() {
        Cadeau gift = null;

        int rand = ThreadLocalRandom.current().nextInt(1,4);

        switch(rand) {
            case 1:
                gift = new Cadeau("Panier pique-nique en osier");
                break;
            case 2:
                gift = new Cadeau("Couverts en bambou");
                break;
            case 3:
                gift = new Cadeau("nappe de pique-nique");
                break;
        }
        return gift;

    }

}
