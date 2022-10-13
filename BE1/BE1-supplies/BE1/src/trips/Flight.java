package trips;

public class Flight {
    private Airport departureAirport;
    

    private Airport arrivalAirport;
    

    private String flightNumber;


    public Flight(String flightNumber, Airport departureAirport, Airport arrivalAirport){
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightNumber = flightNumber;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public String toString(){
        return this.flightNumber + " : " + this.departureAirport.getIata() + " - " + this.arrivalAirport.getIata();
    }

    public boolean isConnectedTo(Flight next){
        return this.arrivalAirport.isSameAs(next.departureAirport);
    }
    
}
