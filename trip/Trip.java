package trip;

public class Trip {

    private String destination;

    public Trip(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Trip to " + destination;
    }
}