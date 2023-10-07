public class LabelDemo {
    public static void main(String[] args) {
        int i,j;
        Outer:
                    for(i=1;i<=10;i++)
                    {
                        System.out.println("Outer"+i);
                            for(j=1;j<=10;j++)
                            {
                                if(j>i)
                                break Outer;
                                System.out.println("Inner"+j);
                            }
                    }
                    System.out.println("I Am Outside the Loop");
                }

    }
    

