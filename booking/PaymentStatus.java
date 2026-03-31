package booking;

public enum PaymentStatus{
    SUCCESS("Paid"),
    FAILED("Error");
    private String d;

    PaymentStatus(String d){
        this.d=d;
    }
    public String getDescription(){return d;
    }
}