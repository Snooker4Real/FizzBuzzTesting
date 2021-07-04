//Pig element
class Pig implements Animal {
    @Override
    public void animalSound() {
        //Le body d'animalSound() est fourni ici
        System.out.println("Le cochon dit : wee wee");
    }

    @Override
    public void sleep() {
        //Le body du sleep() est écrit ici
        System.out.println("Zzz");
    }
}
