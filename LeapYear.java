import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        year=sc.nextString();

        if(year%4==0)
        {
            System.out.println("Year is a Leap Year");
        }
        else
        {
            System.out.println("Year is not a Leap year");
        }


    }   
    
}
