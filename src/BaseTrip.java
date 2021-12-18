import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BaseTrip implements Trip{
    @JsonInclude(JsonInclude.Include.NON_NULL)

    @JsonProperty("_id")
    String id;
    @JsonProperty("_rev") private String revision;

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
