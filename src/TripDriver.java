public class TripDriver {
    public static void main(String[] args) {

        Trip EuropeanTrip = new Paris();

        Trip DecoratedEuropeanTrip = new Paris();
        DecoratedEuropeanTrip = new Circus(DecoratedEuropeanTrip);
        DecoratedEuropeanTrip = new Zoo(DecoratedEuropeanTrip);

        AirlineFactory airline = new AirlineFactory();
        Airline chosenAirline = airline.createAirline(DecoratedEuropeanTrip.getContinent());

        LuxuryTrip lux = new LuxuryTrip();
        System.out.println(lux.bookAddOns(DecoratedEuropeanTrip));


        DatabaseConnector.getConnector();

        DatabaseConnector.commit(DecoratedEuropeanTrip);


    }
}
