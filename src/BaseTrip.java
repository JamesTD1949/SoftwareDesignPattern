public class BaseTrip implements Trip{

    @Override
    public String getDescription() {
        return "Your package will include: ";
    }

    @Override
    public double getCost() {
        return 250;
    }
}
