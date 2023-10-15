import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        int i;
        
        for(i=1;i<=100;i++)
        {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Numbers to be printed");
        i=s.nextInt();
            if(i==0)
            {  
            break;
            }
            System.out.println(i);
           s.close();
        }
    }
    
}
