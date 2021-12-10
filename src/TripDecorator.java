public abstract class TripDecorator implements Trip{
    protected Trip baseTrip;

    protected TripDecorator(Trip newTrip)
    {
        baseTrip = newTrip;
    }

    public String getDescription()
    {
        return baseTrip.getDescription();
    }

    public double getCost()
    {
        return baseTrip.getCost();
    }
}
