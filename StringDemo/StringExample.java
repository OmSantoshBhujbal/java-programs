package StringDemo;

public class StringExample {
    public static void main(String[] args) {
        String s="Hello";
        System.out.println("Length of the string is\t"+s.length());
        
        String s1="Hello";
        String s2="Aptech";
        String s3="                    Hello";
        System.out.println("Character at index 0 is\t"+s1.charAt(0));
        System.out.println(s1.concat(s2));
        System.out.println("Index of A is\t"+s2.indexOf('A') );
        System.out.println("Last Index of h is\t"+s2.lastIndexOf('h'));
        System.out.println("Replace Aptech to Kptech\t"+s2.replace('A','K'));
        System.out.println("Orignal s3 is\t"+s3);
        System.out.println("After Using Trim :"+s3.trim());

    
    
    
    
    
    
    
    
    }



    
}
