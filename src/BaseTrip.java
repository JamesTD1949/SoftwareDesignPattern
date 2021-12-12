public class BaseTrip implements Trip{

    @Override
    public String getDescription() {
        return "Your package will include: ";
    }

    @Override
    public String getContinent() {
        return null;
    }

    @Override
    public double getCost() {
        return 250;
    }
}
