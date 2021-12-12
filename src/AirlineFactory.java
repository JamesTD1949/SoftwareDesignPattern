public class AirlineFactory {

    public Airline createAirline(String continent)
    {
        switch (continent)
        {
            case "Europe":
                return new RyanAir();
            case "Americas":
                return new Delta();
            case "Asia":
                return new Emirates();
            default:
                return null;
        }
    }
}
