import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;
import java.util.List;

/**
 * Created by sobhan on 5/4/17.
 */

public class Cassandra {
    /**
     *
     * @param code that is database column
     * @return
     */


    public List read (String code) {
        //SQL query
        String query = "SELECT * FROM emp Where id =" + code;

        //Creating Cluster object and puss ip address to them
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();

        //Creating Session object
        Session session = cluster.connect("var");

        //Getting the ResultSet
        ResultSet result = session.execute(query);

        return result.all() ;
    }


}
