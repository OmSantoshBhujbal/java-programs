import java.util.Scanner;

    class EmployeeC {
    int id;
    String name;
    double salary;


    EmployeeC(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        scanner.nextLine(); 
        String name = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextFloat();

        
        EmployeeC employee = new EmployeeC(id,name,salary);

        System.out.println("\nEmployee Information:");
        employee.display();

        scanner.close();
    }
}