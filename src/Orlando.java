public class Orlando extends TripDecorator {

    protected Orlando(Trip newTrip)
    {
        super(newTrip);
    }

    public String getDescription()
    {
        return baseTrip.getDescription() + "Orlando, ";
    }

    public double getCost()
    {
        return baseTrip.getCost() + 500.00;
    }
}
