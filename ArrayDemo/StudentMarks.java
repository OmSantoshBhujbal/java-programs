package ArrayDemo;

public class StudentMarks {
    int i;
    int marks[]=new int[6];
    void StoreMarks()
    {
        marks[0]=100;
        marks[1]=150;
        marks[2]=120;
        marks[3]=139;
        marks[4]=132;
        marks[5]=111;
    }
    void display()
    {
        for(i=0;i<6;i++)
        {
            System.out.println("Result of Students is\t"+marks[i]);
        }
    }
public static void main(String[] args) {
    System.out.println("After calling Display Method ");
    StudentMarks student = new StudentMarks();
    student.StoreMarks();
    student.display();
}    

    
    
}
