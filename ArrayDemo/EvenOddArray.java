package ArrayDemo;

public class EvenOddArray {
    public static void main(String[] args) {
        int i,j;
        int Numbers[][]={{10,23,25,24},
                         {34,56,74,79},
                         {27,89,15,36}};
         
         //Display of Array                
        System.out.println("Display of Orignal Array");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=3;j++)
                {
                    System.out.print("\t"+Numbers[i][j]);
                } 
            System.out.println();
        } 


        System.out.println("Array after removal of Odd Numbers");

        
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=3;j++)
            {   
                //Condition for Removal of Odd Numbers and Display of Even Numbers
                 if(Numbers[i][j]%2==0)
                   {
                        System.out.print("\t"+Numbers[i][j]);
                   }
                  else
                  {
                        Numbers[i][j] = 0;
                        System.out.print("\t"+Numbers[i][j]);
                  }  
            }
            System.out.println();
        }
        
    }  
}
