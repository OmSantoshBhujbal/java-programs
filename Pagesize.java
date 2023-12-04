import java.util.Scanner;
    public class Pagesize {
        class A0{
            static void displayA0(){
            int lengthA0,breadthA0;
            lengthA0 = 1189;
            breadthA0 = 841;
            System.out.println("Length of the page is 1189 mm");
            System.out.println("Breadth of the page is 841 mm");
            } 
    }
        class A1 extends A0{
        static void displayA1(){
        int lengthA1,breadthA1;
        lengthA1 = 594;
        breadthA1 = 841;
        System.out.println("Length of the page is 594 mm");
        System.out.println("Breadth of the page is 841 mm");
        }
    }
    class A2 extends A1{
        static void displayA2(){
        int lengthA2,breadthA2;
        lengthA2 = 595;
        breadthA2 = 420;
        System.out.println("Length of the page is 595 mm");
        System.out.println("Breadth of the page is 420 mm");
        }
    }
    class A3 extends A2{
        static void displayA3(){
        int lengthA3,breadthA3;
        lengthA3 = 297;
        breadthA3 = 420;
        System.out.println("Length of the page is 297 mm");
        System.out.println("Breadth of the page is 420 mm");
        }
    }
    class A4 extends A3{
        static void displayA4(){
        int lengthA4,breadthA4;
        lengthA4 = 210;
        breadthA4 = 298;
        System.out.println("Length of the page is 210 mm");
        System.out.println("Breadth of the page is 298 mm");
        }
    }
    class A5 extends A4{
        static void displayA5(){
        int lengthA5,breadthA5;
        lengthA5 = 148;
        breadthA5 = 276;
        System.out.println("Length of the page is 148 mm");
        System.out.println("Breadth of the page is 276 mm");
        }
    }
    class A6 extends A5{
        static void displayA6(){
        int lengthA6,breadthA6;
        lengthA6 = 150;
        breadthA6 = 105;
        System.out.println("Length of the page is 150 mm");
        System.out.println("Breadth of the page is 105 mm");
        }
    }    
    class A7 extends A6{
        static void displayA7(){
        int lengthA7,breadthA7;
        lengthA7 = 74;
        breadthA7 = 106;
        System.out.println("Length of the page is 74 mm");
        System.out.println("Breadth of the page is 106 mm");    
        }
    }    
    class A8 extends A7{
        static void displayA8(){
        int lengthA8,breadthA8;
        lengthA8 = 76;
        breadthA8 = 52; 
        System.out.println("Length of the page is 76 mm");
        System.out.println("Breadth of the page is 52 mm");   
        }
    }
    class display extends A8{
        void view()
        {
        int Pagetype;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Page Type :");
        Pagetype = S.nextLong();
        if(Pagetype = 0)
        {
            d.displayA0();
        }
        else if(Pagetype = 1)
        {
            d.displayA1();
        }
        else if(Pagetype = 2)
        {
            d.displayA2();
        }
        else if(Pagetype = 3)
        {
            d.displayA3();
        }
        else if(Pagetype = 4)
        {
            d.displayA4();
        }
        else if(Pagetype = 5)
        {
            d.displayA5();
        }
        else if(Pagetype = 6)
        {
            d.displayA6();
        }
        else if(Pagetype = 7)
        {
            d.displayA7();
        }
        else if(Pagetype = 8)
        {
            d.displayA8();
        }
        else 
        {
        System.out.println("Invalid Page Type");
        }
    }
}
    public void main(String[] args) {
        view d = new view();
        d.display();   
    }
    }


    

