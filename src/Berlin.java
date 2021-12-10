public class Berlin extends TripDecorator {

    protected Berlin(Trip newTrip)
    {
        super(newTrip);
    }

    public String getDescription()
    {
        return baseTrip.getDescription() + "Berlin, ";
    }

    public double getCost()
    {
        return baseTrip.getCost() + 250.00;
    }
}
