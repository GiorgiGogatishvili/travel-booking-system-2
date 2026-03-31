package booking;

import people.Customer;
import trip.Trip;

public class Booking {

    private Customer customer;
    private Trip trip;

    public Booking(Customer customer, Trip trip) {
        this.customer = customer;
        this.trip = trip;
    }

    public void book() throws PaymentException {
        System.out.println("Booking for " + customer.getName());
    }
}