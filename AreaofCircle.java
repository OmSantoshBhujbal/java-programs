import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        double a,area,pi=3.14225;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle");
        a=sc.nextDouble();
        sc.close();
        area = pi*a*a;
        System.out.println("Area of the given circle is :\t"+area);
    }
    
}

