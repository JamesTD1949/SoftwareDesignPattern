public class TripDriver {
    public static void main(String[] args) {

        Trip EuropeanTrip = new Berlin(new Paris(new BaseTrip()));

        System.out.println(EuropeanTrip.getDescription());

        System.out.println("The total cost of your trip is: " + EuropeanTrip.getCost());
    }
}
