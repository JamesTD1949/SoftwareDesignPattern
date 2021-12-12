public class Berlin extends BaseTrip{

    public Berlin(){
    }

    public String getDescription()
    {
        return "A trip to Berlin,Germany\n";
    }

    public double getCost(){
        return 300.00;
    }

    @Override
    public String getContinent() {
        return "Europe";
    }
}