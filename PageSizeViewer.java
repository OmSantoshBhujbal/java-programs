import java.util.Scanner;
public class PageSizeViewer {
        void displayA0(){
        int lengthA0,breadthA0;
        lengthA0 = 1189;
        breadthA0 = 841;
        System.out.println("Length of the page is 1189 mm");
        System.out.println("Breadth of the page is 841 mm");
        } 
        void displayA1(){
        int lengthA1,breadthA1;
        lengthA1 = 594;
        breadthA1 = 841;
        System.out.println("Length of the page is 594 mm");
        System.out.println("Breadth of the page is 841 mm");
        }
        void displayA2(){
        int lengthA2,breadthA2;
        lengthA2 = 595;
        breadthA2 = 420;
        System.out.println("Length of the page is 595 mm");
        System.out.println("Breadth of the page is 420 mm");
        }
        void displayA3(){
        int lengthA3,breadthA3;
        lengthA3 = 297;
        breadthA3 = 420;
        System.out.println("Length of the page is 297 mm");
        System.out.println("Breadth of the page is 420 mm");
        }
        void displayA4(){
        int lengthA4,breadthA4;
        lengthA4 = 210;
        breadthA4 = 298;
        System.out.println("Length of the page is 210 mm");
        System.out.println("Breadth of the page is 298 mm");
        }
        void displayA5(){
        int lengthA5,breadthA5;
        lengthA5 = 148;
        breadthA5 = 276;
        System.out.println("Length of the page is 148 mm");
        System.out.println("Breadth of the page is 276 mm");
        }
        void displayA6(){
        int lengthA6,breadthA6;
        lengthA6 = 150;
        breadthA6 = 105;
        System.out.println("Length of the page is 150 mm");
        System.out.println("Breadth of the page is 105 mm");
        }
        void displayA7(){
        int lengthA7,breadthA7;
        lengthA7 = 74;
        breadthA7 = 106;
        System.out.println("Length of the page is 74 mm");
        System.out.println("Breadth of the page is 106 mm");    
        }    
        void displayA8(){
        int lengthA8,breadthA8;
        lengthA8 = 76;
        breadthA8 = 52; 
        System.out.println("Length of the page is 76 mm");
        System.out.println("Breadth of the page is 52 mm");   
        }
    public static void main(String[] args) {
        PageSizeViewer pageSizeViewer = new PageSizeViewer();
        int Pagetype,i;
        Scanner S = new Scanner(System.in);
        Pagetype = S.nextInt();
        System.out.println("Enter Page Type :");
        
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
    }   
    }
