package com.hb.panierpiquenique.pojos;

public class Cadeau {
    private static int sId = 1;

    private int id;

    private String name;

    public Cadeau() {
        id = sId ++;
    }

    public Cadeau(String name) {
        this();
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}
