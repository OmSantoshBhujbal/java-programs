public class BreakContinueDemo {
    public static void main(String[] args) {
        int i,j;
        System.out.println("break demo");
        for(i=1;i<=10;i++)
        {
            if(i==5)
                break;
            System.out.println(i);
        }
        System.out.println("continue demo");
        for(i=1;i<=10;i++)
        {
            if(i==5)
                continue;
            System.out.println(i);    
        }
    }
    
}
