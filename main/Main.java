package main;

import people.Customer;
import trip.*;
import booking.*;
import agency.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

 public static void main(String[] args) {

  Customer customer = new Customer("Giorgi");
  customer.setEmail("giorgi@mail.com");

  Flight flight = new Flight("Flight", new BigDecimal("300"));
  Hotel hotel = new Hotel("Hotel", new BigDecimal("120"), 2);

  List<Pricable> services = new ArrayList<>();
  services.add(flight);
  services.add(hotel);

  Trip trip = new Trip("Rome");

  Booking booking = new Booking(customer, trip);

  try {
   booking.book();
  } catch (PaymentException e) {
   System.out.println(e.getMessage());
  }

  BookingService service = new BookingService();

  System.out.println(service.calculateTotal(services));
 }
}