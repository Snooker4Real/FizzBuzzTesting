package com.cindanojonathan.interfacesexos;

// @FunctionalInterface when only 1 abstract method
public interface Flyable {

    void fly(String energy);

    //les classes qui implémentent cette méthode lanceront leur code sinon le default
    default public void test(){
        System.out.println("Test");
    }
}
