package This_demo;

public class Rectangle {
    int width,height;
    Rectangle(int width,int height)
    {
        System.out.println("I am in Parameterized Constructor");
        this.width=width;
        this.height=height;
    }
    void display()
    {
        int area;
        area=width*height;
        System.out.println("Area of Rectangle is "+area);
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(100, 200);
        rect.display();
    }

    
}
