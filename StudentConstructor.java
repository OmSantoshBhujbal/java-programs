public class StudentConstructor {
    String name;
    int age;
    int marks;

    void initializeStudentConstructor()
    {
        name="Amu";
        age=19;
        marks=100;
    }
    void displaysStudentConstructor()
    {
        System.out.println("Name of the student is:\t"+name);
        System.out.println("Age of Student is:\t"+age);
        System.out.println("Marks obtained by student is:\t"+marks);    
    }
    public static void main(String[] args) {
    StudentConstructor st = new StudentConstructor();
    st.initializeStudentConstructor();
    st.displaysStudentConstructor();
    System.out.println(st.name);
    }    
}

