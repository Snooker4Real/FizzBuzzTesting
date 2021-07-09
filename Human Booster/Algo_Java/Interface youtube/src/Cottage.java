public class Cottage extends Building {
    public Cottage(){
        System.out.println("Parcelle en place...");
    }

    public void build(String material){
        System.out.println("Construction du bâtiment en " + material);
    }

}
