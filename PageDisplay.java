import java.util.Scanner;
public class PageDisplay {
        void pagesizeA0(){
        System.out.println("Length of the page is 1189 mm");
        System.out.println("Breadth of the page is 841 mm");
        } 
        void pagesizeA1(){
        System.out.println("Length of the page is 594 mm");
        System.out.println("Breadth of the page is 841 mm");
        }
        void pagesizeA2(){
        System.out.println("Length of the page is 595 mm");
        System.out.println("Breadth of the page is 420 mm");
        }
        void pagesizeA3(){
        System.out.println("Length of the page is 297 mm");
        System.out.println("Breadth of the page is 420 mm");
        }
        void pagesizeA4(){
        System.out.println("Length of the page is 210 mm");
        System.out.println("Breadth of the page is 298 mm");
        }
        void pagesizeA5(){
        System.out.println("Length of the page is 148 mm");
        System.out.println("Breadth of the page is 276 mm");
        }
        void pagesizeA6(){
        System.out.println("Length of the page is 150 mm");
        System.out.println("Breadth of the page is 105 mm");
        }
        void pagesizeA7(){
        System.out.println("Length of the page is 74 mm");
        System.out.println("Breadth of the page is 106 mm");    
        }    
        void pagesizeA8(){ 
        System.out.println("Length of the page is 76 mm");
        System.out.println("Breadth of the page is 52 mm");   
        }
    public static void main(String[] args) {
        PageDisplay pd = new PageDisplay();
        int Page;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Page Type :");
        Page = S.nextInt();
 
        if(+Page == 0)
        {
            pd.pagesizeA0();
        }
        else if(+Page == 1)
        {
            pd.pagesizeA1();
        }
        else if(+Page == 2)
        {
            pd.pagesizeA2();
        }
        else if(+Page == 3)
        {
            pd.pagesizeA3();
        }
        else if(+Page == 4)
        {
            pd.pagesizeA4();
        }
        else if(+Page ==5)
        {
            pd.pagesizeA5();
        }
        else if(+Page == 6)
        {
            pd.pagesizeA6();
        }
        else if(+Page == 7)
        {
            pd.pagesizeA7();
        }
        else if(+Page == 8)
        {
            pd.pagesizeA8();
        }
        else 
        {
        System.out.println("Invalid Input");
        }
        S.close();
    }   
    }

