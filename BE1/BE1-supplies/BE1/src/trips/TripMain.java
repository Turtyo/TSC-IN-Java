package trips;

public class TripMain {
    public static void main(String [] args) {
        System.out.println("Hello from trips.Tripmain");
        Airport myAirport = new Airport("Toulouse Blagnac", "TLS");
        System.out.println("The name of the airport is " + myAirport.getName());
        System.out.println("The iata of the airport is " + myAirport.getIata());
        System.out.println("The airport complete name + iata is " + myAirport.toString());

        System.out.println("");

        Airport arrivalAirport = new Airport("Charles de Gaulle", "CDG");
        Flight myFlight = new Flight("AF1234", myAirport,arrivalAirport);
        System.out.println("The code of the flight is " + myFlight.getFlightNumber());
        System.out.println("The departure airport is " + myFlight.getDepartureAirport());
        System.out.println("The arrival airport is " + myFlight.getArrivalAirport());
        System.out.println("The flight identification is " + myFlight.toString());

        System.out.println("");

        Airport lastAirport = new Airport("Reykjavik", "RKV");
        Flight secondFlight = new Flight("AH6429", arrivalAirport, lastAirport);
        Trip myTrip = new Trip();
        System.out.println("Trip is : " + myTrip.toString());
        myTrip.addFlight(myFlight);
        System.out.println("Trip is : " + myTrip.toString());
        myTrip.addFlight(secondFlight);
        System.out.println("Trip is : " + myTrip.toString());

    }
}
