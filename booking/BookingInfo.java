package booking;

import java.util.Objects;

public final class BookingInfo {

    private final String customerName;
    private final String destination;
    private final double amount;

    public BookingInfo(String customerName, String destination, double amount) {
        this.customerName = customerName;
        this.destination = destination;
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDestination() {
        return destination;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookingInfo that = (BookingInfo) o;
        return Double.compare(that.amount, amount) == 0 &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(destination, that.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, destination, amount);
    }

    @Override
    public String toString() {
        return "BookingInfo{" +
                "customerName='" + customerName + '\'' +
                ", destination='" + destination + '\'' +
                ", amount=" + amount +
                '}';
    }
}