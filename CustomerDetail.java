public class CustomerDetail {
    public static void main(String[] args) {
        Customer cust = new Customer();
        System.out.println("before adress change");
        cust.display();
        System.out.println("After adress change");
        cust.ChangeAdress("Vashi");
        cust.display();
    }
}
