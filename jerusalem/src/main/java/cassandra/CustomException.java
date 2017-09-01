package cassandra;

/**
 * Created by sobhan on 9/2/17.
 */
public class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
