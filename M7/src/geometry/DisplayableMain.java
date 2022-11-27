package geometry;

import java.util.ArrayList;

public class DisplayableMain {
    public static void main(String[] args) {
        ArrayList<Displayable> stock = new ArrayList<Displayable>();
        Position center = new Position(1,0);
        stock.add(new Circle(1, center));
        stock.add(center);
        stock.add(new Position(-12,23));
        for(Displayable disp: stock){
            disp.display();
        }
    }
}
