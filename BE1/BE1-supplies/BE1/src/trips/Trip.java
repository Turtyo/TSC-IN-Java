package trips;

public class Trip {
    private java.util.ArrayList<Flight> flights;

    public Trip(){
        this.flights = new java.util.ArrayList<Flight>();
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public String toString(){
        int numberOfFlights = this.flights.size();
        if(numberOfFlights == 0){
            return "No flight yet";
        }
        else if(numberOfFlights == 1){
            return flights.get(0).getDepartureAirport().getIata() + " - " + flights.get(0).getArrivalAirport().getIata() + " (direct)";
        }
        else {
            return flights.get(0).getDepartureAirport().getIata() + " - " + flights.get(numberOfFlights - 1).getArrivalAirport().getIata() + " (" + numberOfFlights + " flights)";
        }

    }

    public boolean isValid(){
        int numberOfFlights = this.flights.size();
        if(numberOfFlights == 0){
            return false;
        }
        boolean validTrip = true;
        Flight currentFlight = flights.get(0);
        for(int index = 0; index < numberOfFlights - 1; index++){
            Flight nextFlight = flights.get(index + 1);
            validTrip = validTrip & currentFlight.isConnectedTo(nextFlight);
            currentFlight = nextFlight;
        }
        return validTrip;
    }
}
