package com.cindanojonathan.interfacesexos;

public class Ship extends Vehicle implements Flyable{

    public Ship(){
        this.mMovementSpeed= 16;
    }

    @Override
    public void moveXY(int x, int y) {
        System.out.println("Le navire brasseles flots et se déplace en "+ x + ", " + y);
    }

    @Override
    public void fly(String energy) {
        System.out.println("Je me propulse avec du " + energy);
    }
}
