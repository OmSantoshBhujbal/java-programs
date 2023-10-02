public class Customer {
    String CustName="ABC";
    String CustAdress="Panvel";

    void ChangeAdress(String add)
    {
        CustAdress = add;     
    }
    void display()
    {
        System.out.println("Name is"+CustName);
        System.out.println("Address is"+CustAdress);        
    }
}
