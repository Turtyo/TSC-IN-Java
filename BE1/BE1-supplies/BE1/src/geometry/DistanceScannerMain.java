package geometry;

import java.util.Scanner;
import java.util.Locale;
import geometry.Position.DistanceType;

public class DistanceScannerMain {
    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.US);

            Position p1 = new Position(sc.nextFloat(),sc.nextFloat());
            Position p2 = new Position(sc.nextFloat(),sc.nextFloat());

            System.out.println("Euclidian distance between " + p1 + " and " + p2 + " is : " + Position.distance(DistanceType.euclide,p1,p2));
            System.out.println("Manhattan distance between " + p1 + " and " + p2 + " is : " + Position.distance(DistanceType.manhattan,p1,p2));
        }
    }
    

}
