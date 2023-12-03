package Interface;

interface Color
{
    void DrawColor(String ColorName);
}

interface Draw extends Color
{
    void drawing(String Shape);
}

class Circle implements Draw
{
    @Override
    public void DrawColor(String ColorName)
    {
        System.out.println("Color of the Circle is "+ColorName);
    }
    @Override
    public void drawing(String Shape)
    {
        System.out.println("Object is a "+Shape);
    }  
}    

class Triangle implements Draw
{
    @Override
    public void DrawColor(String ColorName)
    {
        System.out.println("Color of the Triangle is "+ColorName);
    }
@Override
    public void drawing(String Shape)
    {
        System.out.println("Object is a "+Shape);
    }
}
public class InterfaceFirst{
    public static void main(String[] args) {
        Triangle draw1 = new Triangle(); 
        draw1.drawing("Triangle");
        draw1.DrawColor("Orange"); 
        
        Circle draw2 = new Circle();
        draw2.drawing("Circle");
        draw2.DrawColor("Blue");

    }
}
    

