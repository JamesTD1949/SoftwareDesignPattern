public abstract class ActivityDecorator implements Trip{
    protected Trip baseTrip;

    protected ActivityDecorator(Trip newTrip)
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
