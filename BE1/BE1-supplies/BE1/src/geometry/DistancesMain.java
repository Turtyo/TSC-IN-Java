package geometry;

import geometry.Position.DistanceType;

public class DistancesMain {
    public static void main(String [] args) {
        Position p1 = new Position(2,3);
        Position p2 = new Position(-1,-1);
        System.out.println("Euclidian distance between " + p1 + " and " + p2 + " is : " + Position.euclide(p1,p2));
        System.out.println("Manhattan distance between " + p1 + " and " + p2 + " is : " + Position.manhattan(p1,p2));

        System.out.println("");

        System.out.println("With distance method");
        System.out.println("Euclidian distance between " + p1 + " and " + p2 + " is : " + Position.distance(DistanceType.euclide,p1,p2));
        System.out.println("Manhattan distance between " + p1 + " and " + p2 + " is : " + Position.distance(DistanceType.manhattan,p1,p2));


        
    }
}
