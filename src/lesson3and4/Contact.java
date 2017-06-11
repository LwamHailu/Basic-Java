package lesson3and4;
public class Contact {
  private String firstName;
  private String lastName;
  public Contact (String fistName, String lastName) {
    this.firstName = fistName;
    this.lastName = lastName;
  }
  public String getFirstName() {return firstName;}
  public String getLastName() {return lastName;}

  public String getContact() {
    return firstName + " " + lastName;
  }

  @Override
  public String toString() {
    return "["+getContact()+"]";
  }
  public static void main(String []args){
	  Contact sc=new Contact("lajs","hasdavah");
	  System.out.println(sc);
  }
}