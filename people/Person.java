package people;

public abstract class Person implements Identifiable {

 protected String name;

 public Person(String name) {
  this.name = name;
 }

 @Override
 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public abstract String getRole();
}