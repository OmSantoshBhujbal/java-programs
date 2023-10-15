package Constructor_Overloading;

public class StudentCO {
    int marks,rollno;
    String name,email;
    StudentCO(int marks,int rollno)
    {
        System.out.println("I Am In First Constructor");
        this.marks=marks;
        this.rollno=rollno;
    }
    
    StudentCO(String email,int marks,int rollno)
    {
        System.out.println("I Am In Third Constructor");
        this.email=email;
        this.marks=marks;
        this.rollno=rollno;
    }
    StudentCO(int marks,int rollno,String name)
    {
        System.out.println("I Am In Second Constructor");
        this.marks=marks;
        this.rollno=rollno;
        this.name=name;
    }
    void display()
    {
        System.out.println("Marks Obtained By Student is "+marks);
        System.out.println("Roll No Of The Student is"+rollno);
        System.out.println("Name Of The Student is"+name);
        System.out.println("Email Of The Student is"+email);
    }
    public static void main(String[] args) {
        StudentCO St1 = new StudentCO(100, 10);
        St1.display();
        System.out.println();
        StudentCO St2 = new StudentCO("namratahdcompe@student.mes.ac.in", 100, 10);
        St2.display();
        System.out.println();
        StudentCO St3 = new StudentCO(100, 101, "Namrata" );
        St3.display();
        

    }
        
    
    
}
