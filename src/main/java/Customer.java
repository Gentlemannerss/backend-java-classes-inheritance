public class Customer {
    public String firstName;
    public String lastName = "No last name";
    public Integer customerNumber;
    private CreditCard creditCard;

    public Customer(String firstName, String lastName, Integer customerNumber, CreditCard creditCard) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.customerNumber = customerNumber;
    this.creditCard = creditCard;
    }

    public Customer(String firstName) {
        this.firstName = firstName;
    }

    public Customer(String firstName, CreditCard creditCard) {
        this.firstName = firstName;
        this.creditCard = creditCard;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printName () {
        System.out.println("Customer: " + customerNumber + firstName + lastName);
    }

    public String getName() {
        return customerNumber + " " + firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
