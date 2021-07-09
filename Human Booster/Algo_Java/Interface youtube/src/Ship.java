public class Ship extends Vehicle{

    public Ship(){
        this.mMovementSpeed= 16;
    }

    @Override
    public void moveXY(int x, int y) {
        System.out.println("Le navire brasseles flots et se déplace en "+ x + ", " + y);
    }
}
