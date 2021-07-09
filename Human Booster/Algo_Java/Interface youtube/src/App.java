//import cindanojonathan.*;

public class App {
    public static void main(String[] args) {
        Cottage c = new Cottage();
        c.build("bois");

        Ship s = new Ship();
        Glider g = new Glider();
        s.moveXY(146,97);
        g.moveXY(80,23);
    }
}
