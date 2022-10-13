package trips;

public class ValidationMain {
    public static void main(String [] args) {

        Airport firstAirport = new Airport("Toulouse Blagnac", "TLS");
        Airport secondAirport = new Airport("Charles de Gaulle", "CDG");
        Airport thirdAirport = new Airport("Reykjavik", "RKV");

        System.out.println(firstAirport + " is same as " + firstAirport + " : " + firstAirport.isSameAs(firstAirport));
        System.out.println(firstAirport + " is same as " + secondAirport + " : " + firstAirport.isSameAs(secondAirport));
        System.out.println(thirdAirport + " is same as " + secondAirport + " : " + thirdAirport.isSameAs(secondAirport));

        System.out.println("");

        Flight firstFlight = new Flight("AF1234", firstAirport, secondAirport);
        Flight secondFlight = new Flight("AH6429", secondAirport, thirdAirport);
        
        System.out.println(firstFlight + " is connected to " + secondFlight + " : " + firstFlight.isConnectedTo(secondFlight));
        System.out.println(secondFlight + " is connected to " + firstFlight + " : " + secondFlight.isConnectedTo(firstFlight));
        System.out.println(firstFlight + " is connected to " + firstFlight + " : " + firstFlight.isConnectedTo(firstFlight));

        System.out.println("");

        Trip myTrip = new Trip();
        myTrip.addFlight(firstFlight);
        myTrip.addFlight(secondFlight);
        System.out.println(myTrip + " is a valid trip : " + myTrip.isValid());
        
    }
}
