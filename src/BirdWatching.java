public class BirdWatching extends ActivityDecorator{
    protected BirdWatching(Trip newTrip)
    {
        super(newTrip);
    }

    public String getDescription()
    {
        return baseTrip.getDescription() + "Bird Watching in the local Park\n";
    }

    public double getCost()
    {
        return baseTrip.getCost() + 0.00;
    }
}
