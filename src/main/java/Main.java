public class Main {

    public static void main(String[] args) {
        /*CreditCard card1 = new CreditCard(1500);*/
        Customer customer = new Customer("damon");
        customer.setFirstName("Damon");
        customer.setLastName("van Bergen");
        customer.setCustomerNumber(1);
        System.out.println(customer);
        Customer customer1 = new Customer("Petro", "van Bergen", 2, new VisaCard(0));
        Customer customer2 = new Customer("Ilse", "van Nierop");
        Customer customer3 = new Customer("Willy", new MasterCard(0));
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        customer1.getCreditCard().pay(100);
        customer3.getCreditCard().pay(100);
        System.out.println(customer1.getCreditCard().getDebt());
        System.out.println(customer3.getCreditCard().getDebt());
    }
}