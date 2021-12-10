public class Paris extends TripDecorator {

    protected Paris(Trip newTrip)
    {
        super(newTrip);
    }

    public String getDescription()
    {
        return baseTrip.getDescription() + "Paris, ";
    }

    public double getCost()
    {
        return baseTrip.getCost() + 200.00;
    }
}
