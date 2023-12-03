package Interface;

public class Calculation {
    int a,b;
    void multiply(){
        int a,b;
    }
   void display(){
    int a=20;
    int b=10;
    System.out.println("Multiplication is"+a*b);
}

public static void main(String[] args) {
    Calculation c =new Calculation();
    c.display();
}
}