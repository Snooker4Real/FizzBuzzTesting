package com.hb.panierpiquenique.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hb.panierpiquenique.builders.PanierPiqueNiqueBuilder;
import com.hb.panierpiquenique.factories.CadeauFactory;
import com.hb.panierpiquenique.iterators.BouteilleDecoratorCollection;
import com.hb.panierpiquenique.pojos.BouteilleChampagne;
import com.hb.panierpiquenique.pojos.BouteilleDecorator;
import com.hb.panierpiquenique.pojos.BouteilleRose;
import com.hb.panierpiquenique.pojos.BouteilleVinBlanc;
import com.hb.panierpiquenique.pojos.BouteilleVinRouge;
import com.hb.panierpiquenique.pojos.Cadeau;
import com.hb.panierpiquenique.pojos.Panier;
import com.hb.panierpiquenique.pojos.PanierPiqueNique;


public class PanierPiqueNiqueMain {
    private static Scanner sc = new Scanner(System.in);
    private static List<Panier> baskets = new ArrayList<Panier>();
    private static BouteilleDecoratorCollection bottles = new BouteilleDecoratorCollection();

    private static void initBottles() {
        bottles.add(new BouteilleRose());
        bottles.add(new BouteilleVinBlanc());
        bottles.add(new BouteilleVinRouge());
        bottles.add(new BouteilleChampagne());
    }

    private static void initBaskets() {
        baskets.add(new Panier("pique-nique étoilé du Burgundy", 33.5));
        baskets.add(new Panier("pique-nique healty de Jour", 19.9));
        baskets.add(new Panier("pique-nique franchouillard de Frichti", 7));
        baskets.add(new Panier("pique-nique iodé de La Maison Nordique", 14.5));
    }


    private static int getChoice(String message) {
        int choice = 0;

        System.out.println(message);

        try {
            choice = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e) {
            System.out.println("erreur de saisie: "+e.getMessage());
        }
        return choice;
    }

    private static void showBaskets() {
        System.out.println("paniers disponibles:");
        System.out.println("1) Le pique-nique étoilé du Burgundy");
        System.out.println("2) Le pique-nique healthy de Jour");
        System.out.println("3) Le pique-nique franchouillard de Frichti");
        System.out.println("4) Le pique-nique iodé de La Maison Nordique");
    }

    private static void showNbGuests() {
        System.out.println("nombre de personnes disponibles:");
        System.out.println("\t - 2 personnes");
        System.out.println("\t - 4 personnes");
        System.out.println("\t - 6 personnes");
    }

    private static Panier getBasket(int basketIdx) {

        for(Panier itemPanier : baskets) {
            if(itemPanier.getId() == basketIdx) {
                return itemPanier;
            }
        }

        return null;
    }

    private static void showBottles() {
        int idx = 1;
        for(BouteilleDecorator bottle : bottles) {
            System.out.println(idx+ ". "+bottle.getType()+" "+bottle.getPrice()+" €");
            idx ++;
        }
    }

    public static void main(String[] args) {
        initBaskets();

        initBottles();

        PanierPiqueNiqueBuilder builder = new PanierPiqueNiqueBuilder();

        showNbGuests();

        int nbGuests = getChoice("veuillez saisir un nombre de personnes:");

        builder.defineNbGuests(nbGuests);

        showBaskets();

        int basketIdx = getChoice("veuillez saisir un choix de panier");
        Panier basket = getBasket(basketIdx);

        if(basket != null) {
            basket.setPrice(basket.getPrice()*nbGuests + 10);

            BouteilleDecorator bottle = null;

            System.out.println( "Souhaitez-vous ajouter une bouteille de vin ou de champagne (o/n) ?");
            String choiceBottle = sc.nextLine();

            if(choiceBottle.equalsIgnoreCase("o")) {
                showBottles();
                int bottleIdx = getChoice("Entrer le numéro de la bouteille");

                bottle = bottles.get( bottleIdx - 1);
                bottle.setName(basket.getName());
                bottle.setPrice(bottle.getPrice()+ basket.getPrice());
                bottle.setBasket(basket);

                System.out.println("Vous avez ajouté une "+bottle.getType());

                builder.defineBasket(bottle);
            }
            else {
                builder.defineBasket(basket);
            }

            System.out.println("Veuillez saisir un message : ");
            String message = sc.nextLine();

            builder.defineMessage(message);

            Cadeau gift = CadeauFactory.getInstance().generateCadeau();

            builder.defineGift(gift);



            PanierPiqueNique piqueNique = builder.build();
            String message2 = null;
            Panier resBasket = piqueNique.getBasket();

            if(resBasket instanceof BouteilleDecorator) {
                BouteilleDecorator resBottle = (BouteilleDecorator) resBasket;
                message2 = String.format("Panier %s pour %d personnes avec une %s.\n\n"
                                +"Prix du panier: %.02f €\n\n"
                                + "Message personnalisé: %s \n\n"
                                + "Cadeau: %s", resBottle.getName(),
                        piqueNique.getNbGuests(),
                        resBottle.getType(),
                        resBottle.getPrice(),
                        piqueNique.getMessage(),
                        piqueNique.getGift()
                );
            }else {
                message2 = String.format("Panier %s pour %d personnes sans bouteilles\n\n"
                                +"Prix du panier: %.02f €\n\n"
                                + "Message personnalisé: %s \n\n"
                                + "Cadeau: %s", resBasket.getName(),
                        piqueNique.getNbGuests(),
                        resBasket.getPrice(),
                        piqueNique.getMessage(),
                        piqueNique.getGift()
                );
            }
            System.out.println(message2);
        }else {
            System.out.println("l'index "+basketIdx+" n'existe pas");
        }

        sc.close();
    }






}
