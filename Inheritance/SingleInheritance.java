package Inheritance;

class Birds{
    int noOfEyes;
    int Wings;
    int noOfLegs;
    boolean Beak;

    void displayWings()
    {
        System.out.println("No of wings are"+Wings);
    }


}

class Vulture extends Birds{
    String BirdName;
    String BirdType;

    Vulture(int eyes,int legs, boolean beak,String name,String type,int wings)
    {
        BirdName = name;
        noOfEyes = eyes;
        noOfLegs = legs;
        Beak = beak;
        BirdType = type;
        Wings = wings;

    }

    void displayInfo()
    {
        System.out.println("Name of the Bird is"+BirdName);
        System.out.println("Number of eyes is"+noOfEyes);
        System.out.println("Number of Legs"+noOfLegs);
        System.out.println("Beak present is "+Beak);
        System.out.println("Type of the Bird is+BirdType");
        System.out.println("No of wings is"+Wings);                       
    }
        
    
}

public class SingleInheritance {
    public static void main(String[] args) {
        Vulture vulture = new Vulture(2, 2, true, "Vulture", "BigBirds",2);
        vulture.displayWings();
        vulture.displayInfo();
    }

}
