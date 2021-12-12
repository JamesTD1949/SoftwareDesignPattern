public class Paris extends BaseTrip{

    protected Paris(){
    }

    public String getDescription()
    {
        return "A trip to Paris,France\n";
    }

    public double getCost(){
        return 500.00;
    }

    public String getContinent() {
        return "Europe";
    }
}
