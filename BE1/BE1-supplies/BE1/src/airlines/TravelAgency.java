package airlines;

public class TravelAgency {

   private String name;
   private java.util.ArrayList<Airline> suppliers;

   public TravelAgency(String name) {
      this.name = name;
      this.suppliers = new java.util.ArrayList<Airline>();
   }

   public void addAirline(Airline airline) {
      String iata = airline.getIata();
      int numberOfAirlines = suppliers.size();
      boolean needsToBePlaced = true;
      if(numberOfAirlines == 0){
         suppliers.add(airline);
         needsToBePlaced = false;
      }
      else {
         for(int index = 0; index < numberOfAirlines; index++){
            if(suppliers.get(index).getIata().compareTo(iata) >= 0){
               suppliers.add(index, airline);
               needsToBePlaced = false;
            }
         }
      }
      if(needsToBePlaced){
         suppliers.add(airline);
      }
   }

   public Airline getAirlineByIata(String iata) {
      int numberOfAirlines = suppliers.size();
      for(int index = 0; index < numberOfAirlines; index++){
         Airline currentAirline = this.suppliers.get(index);
         if(currentAirline.getIata() == iata){
            return currentAirline;
         }
      }
      return null;
   }

   public void display() {
      System.out.println(this.name);
      System.out.println("Suppliers:");
      // since the list is already in the right order thanks to addAirline, we just print
      for(Airline currentAirline : suppliers){
         System.out.println(currentAirline);
      }
      System.out.println("End of suppliers");
   }
}
