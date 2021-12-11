public class Circus extends ActivityDecorator {

    protected Circus(Trip newTrip)
    {
        super(newTrip);
    }

    public String getDescription()
    {
        return baseTrip.getDescription() + "A Circus Show\n";
    }

    public double getCost()
    {
        return baseTrip.getCost() + 74.99;
    }
}
