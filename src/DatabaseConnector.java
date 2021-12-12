import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

import java.net.MalformedURLException;

public class DatabaseConnector {

    private static DatabaseConnector firstConnector = null;
    private static CouchDbInstance dbInstance = null;

    //method to set up couchdb connection
    private void setUpClient()
    {
        HttpClient httpClient = null;
        try {
            httpClient = new StdHttpClient.Builder()
                    .url("http://localhost:5984")
                    .username("admin")
                    .password("admin")
                    .build();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

        dbInstance = new StdCouchDbInstance(httpClient);

    }

    public static DatabaseConnector getConnector()
    {
        if (firstConnector == null)
        {
            firstConnector = new DatabaseConnector();
        }
        return firstConnector;
    }

    public static void commit(Trip trip)
    {
        //CouchDbConnector couchConnector = dbInstance.createConnector("agency",true);
        //couchConnector.create(trip);

        System.out.println(trip.getDescription() + " has been committed to the couchDB database.");
    }
}
