package ArrayDemo;

public class TwoDim {
    public static void main(String[] args) {
        int i,j;
        int[][]student={{100,40,50},
                         {150,30,45},
                         {45,50,110}};
        for(i=0;i<3;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print("\t"+student[i][j]);
            }
            System.out.println();
        }                        
    }

    
}
