package people;

public enum Role {

    CUSTOMER("Client"),
    AGENT("Worker");

    private String label;

    Role(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}