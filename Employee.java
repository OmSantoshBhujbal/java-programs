public class Employee {
    int EmpAge;
    String EmpName;
    //Default Constructor
    Employee()
    {
        System.out.println("This is a Default Constructor");
        EmpAge=19;
        EmpName="Amu";
    }
    //Parameterized Constructor
    Employee(int age,String name)
    {
        EmpAge=age;
        EmpName=name;
    }

    void displayEmp()
    {
        System.out.println("Age is\t"+EmpAge);
        System.out.println("Name is\t"+EmpName);

    }
    public static void main(String[] args) {
        
    }
    
}
