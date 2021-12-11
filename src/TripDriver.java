public class TripDriver {
    public static void main(String[] args) {

        Trip EuropeanTrip = new Paris();

        Trip DecoratedEuropeanTrip = new Paris();
        DecoratedEuropeanTrip = new Circus(DecoratedEuropeanTrip);
        DecoratedEuropeanTrip = new Zoo(DecoratedEuropeanTrip);

        System.out.println(EuropeanTrip.getDescription());
        System.out.println("The total cost of your trip is: " + EuropeanTrip.getCost());

        System.out.println(DecoratedEuropeanTrip.getDescription());
        System.out.println("The total cost of your trip is: " + DecoratedEuropeanTrip.getCost());
    }
}
