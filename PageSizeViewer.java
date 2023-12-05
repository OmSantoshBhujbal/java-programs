import java.util.Scanner;
public class PageSizeViewer {
        void displayA0(){
        int lengthA0,breadthA0;
        lengthA0 = 1189;
        breadthA0 = 841;
        System.out.println("Length of the page is"+ lengthA0 +"mm");
        System.out.println("Breadth of the page is"+breadthA0 +"mm");
        } 
        void displayA1(){
        int lengthA1,breadthA1;
        lengthA1 = 594;
        breadthA1 = 841;
        System.out.println("Length of the page is"+ lengthA1 +"mm");
        System.out.println("Breadth of the page is"+breadthA1 +"mm");
        }
        void displayA2(){
        int lengthA2,breadthA2;
        lengthA2 = 595;
        breadthA2 = 420;
        System.out.println("Length of the page is"+ lengthA2 +"mm");
        System.out.println("Breadth of the page is"+breadthA2 +"mm");
        }
        void displayA3(){
        int lengthA3,breadthA3;
        lengthA3 = 297;
        breadthA3 = 420;
        System.out.println("Length of the page is"+ lengthA3 +"mm");
        System.out.println("Breadth of the page is"+breadthA3 +"mm");
        }
        void displayA4(){
        int lengthA4,breadthA4;
        lengthA4 = 210;
        breadthA4 = 298;
        System.out.println("Length of the page is"+ lengthA4 +"mm");
        System.out.println("Breadth of the page is"+breadthA4 +"mm");
        }
        void displayA5(){
        int lengthA5,breadthA5;
        lengthA5 = 148;
        breadthA5 = 276;
        System.out.println("Length of the page is"+ lengthA5 +"mm");
        System.out.println("Breadth of the page is"+breadthA5 +"mm");
        }
        void displayA6(){
        int lengthA6,breadthA6;
        lengthA6 = 150;
        breadthA6 = 105;
        System.out.println("Length of the page is"+ lengthA6  +"mm");
        System.out.println("Breadth of the page is"+breadthA6 +"mm");
        }
        void displayA7(){
        int lengthA7,breadthA7;
        lengthA7 = 74;
        breadthA7 = 106;
        System.out.println("Length of the page is"+ lengthA7 +"mm");
        System.out.println("Breadth of the page is"+breadthA7 +"mm");   
        }    
        void displayA8(){
        int lengthA8,breadthA8;
        lengthA8 = 76;
        breadthA8 = 52; 
        System.out.println("Length of the page is"+ lengthA8 +"mm");
        System.out.println("Breadth of the page is"+breadthA8 +"mm");   
        }
    public static void main(String[] args) {
        PageSizeViewer pageSizeViewer = new PageSizeViewer();
        int Pagetype;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Page Type :A");
        Pagetype = S.nextInt();
        
        
        if(+Pagetype == 0)
        {
            pageSizeViewer.displayA0();
        }
        else if(+Pagetype == 1)
        {
            pageSizeViewer.displayA1();
        }
        else if(+Pagetype == 2)
        {
            pageSizeViewer.displayA2();
        }
        else if(+Pagetype == 3)
        {
            pageSizeViewer.displayA3();
        }
        else if(+Pagetype == 4)
        {
            pageSizeViewer.displayA4();
        }
        else if(+Pagetype ==5)
        {
            pageSizeViewer.displayA5();
        }
        else if(+Pagetype == 6)
        {
            pageSizeViewer.displayA6();
        }
        else if(+Pagetype == 7)
        {
            pageSizeViewer.displayA7();
        }
        else if(+Pagetype == 8)
        {
            pageSizeViewer.displayA8();
        }
        else 
        {
        System.out.println("Invalid Page Type");
        }
        S.close();
    }   
    }
