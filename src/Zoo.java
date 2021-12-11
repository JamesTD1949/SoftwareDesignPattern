public class Zoo extends ActivityDecorator {

    protected Zoo(Trip newTrip)
    {
        super(newTrip);
    }

    public String getDescription()
    {
        return baseTrip.getDescription() + "A day at the Zoo\n";
    }

    public double getCost()
    {
        return baseTrip.getCost() + 200.00;
    }
}
