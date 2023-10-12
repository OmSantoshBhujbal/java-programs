public class CustomerDetail {
    String CustName="APPLE.Inc";
    String CustAdress="Panvel";
    void display()
    {
        System.out.println("Company Name is "+CustName);
        System.out.println("Branch Address is "+CustAdress);        
    }

    public static void main(String[] args) {
        CustomerDetail cust = new CustomerDetail();
        System.out.println("Displaying method");
        cust.display();
    }
    }  
