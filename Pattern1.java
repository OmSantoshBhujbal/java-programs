import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int i,j,rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        rows=sc.nextInt();
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("\t"+i);
            }
            System.out.println();
        }
        for(i=rows-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("\t"+i);
            }
            System.out.println();
        }
    }
    
}
