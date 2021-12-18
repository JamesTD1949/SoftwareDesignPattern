public class BudgetTrip extends BookTrip {
    @Override
    public void firstClass() {
        tripDetails += "Economy Class\n";
    }

    @Override
    public void extraLuggage() {
        tripDetails += "Standard Luggage\n";
    }

    @Override
    public void travelInsurance() {
        tripDetails += "No Travel Insurance\n";
    }
}
