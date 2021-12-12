public class TripDriver {
    public static void main(String[] args) {

        Trip EuropeanTrip = new Paris();

        Trip DecoratedEuropeanTrip = new Paris();
        DecoratedEuropeanTrip = new Circus(DecoratedEuropeanTrip);
        DecoratedEuropeanTrip = new Zoo(DecoratedEuropeanTrip);

        AirlineFactory airline = new AirlineFactory();
        Airline chosenAirline = airline.createAirline(DecoratedEuropeanTrip.getContinent());

        System.out.println(DecoratedEuropeanTrip.getDescription());
        System.out.println("Your Airline will be: " + chosenAirline.getName());
        System.out.println("The total cost of your trip is: " + DecoratedEuropeanTrip.getCost() + chosenAirline.getCost());
    }
}
