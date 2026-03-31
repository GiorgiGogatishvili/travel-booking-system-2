package people;

public class Customer extends Person {

 private String email;

 public Customer(String name) {
  super(name);
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  if (email == null || !email.contains("@")) {
   throw new InvalidPersonException("Invalid email");
  }
  this.email = email;
 }

 @Override
 public String getRole() {
  return "Customer";
 }
}