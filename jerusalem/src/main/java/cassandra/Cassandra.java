package cassandra;

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
     * @throws CustomException that if code is null throws
     */

    public List read (String code) throws CustomException {

        if (code != null) {
            //SQL query
            String query = "SELECT * FROM emp Where id =" + code;

            //Creating Cluster object and puss ip address to them
            Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();

            //Creating Session object
            Session session = cluster.connect("var");

            //Getting the ResultSet
            ResultSet result = session.execute(query);

            return result.all();
        }
            throw new CustomException("code is null");


    }




}
