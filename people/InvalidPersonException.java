package people;

public class InvalidPersonException extends RuntimeException {

    public InvalidPersonException(String message) {
        super(message);
    }
}