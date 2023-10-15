package Method_Overriding;

class bank{
    float getROI()
    {
        return 10.5f;
    }   
}

class BOI extends bank{
    float getROI()
    {
        return 6.5f;
    } 
}

class KOTAK extends bank{
    float getROI(){
        return 10f;
    }
}   
public class MethodOverriding {
    public static void main(String[] args) {
        bank ban = new bank();
        System.out.println("Rate of intrest of  bank is  "+ban.getROI());
        BOI boi = new BOI();
        System.out.println("Rate of intrest of SBI is  "+boi.getROI());
        KOTAK kok = new KOTAK();
        System.out.println("Rate of intrest of KOTAK is  "+kok.getROI());
    }   
}