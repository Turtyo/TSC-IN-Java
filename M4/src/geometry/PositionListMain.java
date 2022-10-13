package geometry;

import java.util.ArrayList;

public class PositionListMain {
    public static void main(String[] args) {
        ArrayList<Position> listOfPositions = new ArrayList<>();
        listOfPositions.add(new Position(0,0));
        listOfPositions.add(new Position(1,0));
        listOfPositions.add(new Position(2,2));

        for(Position currentPos : listOfPositions){
            System.out.println(currentPos);
        }
    }
}
