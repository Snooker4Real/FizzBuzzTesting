package com.cindanojonathan.interfacesexos;

public class Cottage extends Building implements Flyable{
    public Cottage(){
        System.out.println("Parcelle en place...");
    }

    public void build(String material){
        System.out.println("Construction du bâtiment en " + material);
    }
    public void fly(String energy) {
        System.out.println("Je me propulse avec du " + energy);
    }

}
