public class LuxuryTrip extends BookTrip {
    @Override
    protected void firstClass() {
        tripDetails += "First Class\n";
        totalCost += firstClass;
    }

    @Override
    protected void extraLuggage() {
        tripDetails += "Extra Luggage\n";
        totalCost += extraLuggage;
    }

    @Override
    protected void travelInsurance() {
        tripDetails += "Travel Insurance\n";
        totalCost += travelInsurance;
    }
}
