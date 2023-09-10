import java.util.Scanner;

public class GoodMorning {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your Greeting");
        int type = a.nextInt();
        //a.close();
        //Scanner b = new Scanner(System.in);
        System.out.println("Enter CHOICE:");
        String time = a.nextLine();
        //b.close();
        switch (type) 
        {
            case 1:
                System.out.println("GoodMorning");
                switch(time)
                {
                    case "Am":
                    System.out.println("AM");
                    break;
                    default:
                    System.out.println("Invalid Input");
                    break;
                }
                break;
            case 2:
                System.out.println("GoodAfternoon");
                switch(time)
                {
                    case "Noon":
                    System.out.println("NOON");
                    break;
                    default:
                    System.out.println("Invalid Input");
                    break;
                }
                break;
            case 3:
                System.out.println("GoodEvening");
                switch(time)
                {
                    case "Eve":
                    System.out.println("EVE");
                    break;
                    default:
                    System.out.println("Invalid Input");
                    break;
                }
                break;
            case 4:
            
                System.out.println("GoodNight");
                switch(time)
                {
                    case "Pm":
                    System.out.println("PM");
                    break;
                    default:
                    System.out.println("Invalid Input");
                    break;
                }        
                break;       
            default:
                System.out.println("InvalidInput");
                break;
                
        }
    }    
}
