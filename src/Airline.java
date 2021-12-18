public abstract class Airline {

    private String name;
    private Double cost;
    protected BoatTravel sailable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String trySailing()
    {
        return sailable.sails();
    }

    private void setSailable(BoatTravel newBoating)
    {
        sailable = newBoating;
    }
}
