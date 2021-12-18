public abstract class BookTrip {

    protected static double totalCost = 0.0;
    protected static String tripDetails = "";
    protected double firstClass = 200.00;
    protected double extraLuggage = 29.99;
    protected double travelInsurance = 49.99;


    final protected String bookAddOns(Trip trip)
    {
        tripDetails += trip.getDescription() + "\n";

        AirlineFactory airline = new AirlineFactory();
        Airline chosenAirline = airline.createAirline(trip.getContinent());

        tripDetails += chosenAirline.getName() + "\n";

        totalCost += trip.getCost() + chosenAirline.getCost();

        firstClass();
        extraLuggage();
        travelInsurance();
        addTax();
        return "The Details of your trip are: " + tripDetails + "The total cost of your trip is: " + totalCost;
    }


    protected void addTax()
    {
        totalCost *= 1.21;
    }

    protected abstract void firstClass();
    protected abstract void extraLuggage();
    protected abstract void travelInsurance();

}
