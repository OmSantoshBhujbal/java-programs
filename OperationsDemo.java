public class OperationsDemo {
    int result;
    float sum()
    {
        int a,b;
        a=10;
        b=20;
        result=a+b;
        return result;
    }
    //implicit type casting (lower to higher)
    float div()
    {
        int a,b;
        a=10;
        b=20;
        float a1,b1,div;
        a1=a;
        b1=b;
        div=a1/b1;
        return div;
    }
    //explicit type casting (lower to higher)
    float a=10.25f;
    int add=(int)a+5;
    System.out.println("Add is "+add);


    public static void main(String[] args) {
        OperationsDemo op = new OperationsDemo();
        System.out.println("Sum is"+op.sum());
        System.out.println("Division is"+op.div());

        

    }
}