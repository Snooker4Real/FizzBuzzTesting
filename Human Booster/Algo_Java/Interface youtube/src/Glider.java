import java.security.PublicKey;

public class Glider extends Vehicle{
    public  Glider(){
        this.mMovementSpeed= 0;
    }

    @Override
    public void moveXY(int x, int y) {
        System.out.println("Le planeur fend l'air vers " + x + ", " + y);
    }
}
