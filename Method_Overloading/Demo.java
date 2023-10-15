package Method_Overloading;

public class Demo {
    void add(int a,int b)
    {
        System.out.println("Addition of the following is"+(a+b));
    }
    void add(float a ,int b)
    {
        System.out.println("Addition of the following is"+(a+b));
    }
    void add(int a,int b,int c)
    {
        System.out.println("Addition of the following is"+(a+b+c));
    }
    void add(double a,int b)
    {
        System.out.println("Addition of the following is"+(a+b));
    }
    int add(long a,float b,int c)
    {
        System.out.println("Addition of the following is"+c);
         return c;
    }
    public static void main(String[] args) {
        Demo nigga = new Demo();
        nigga.add(10, 20);
        nigga.add(10.40f, 30);
        nigga.add(10, 20, 30);
        nigga.add(10.2,20);
    }
}

