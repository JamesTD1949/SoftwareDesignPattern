public class BaseTrip implements Trip{

    @Override
    public String getDescription() {
        return "Your trip will include visits to: ";
    }

    @Override
    public double getCost() {
        return 250;
    }
}
