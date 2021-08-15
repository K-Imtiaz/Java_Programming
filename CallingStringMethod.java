public class CallingStringMethod {
    public static void main(String[] args) {
        String s1= "Imtiaz Ahmed";
        System.out.println(s1);
        //Upper Case,Lower Case;
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        String s2=s1.toUpperCase();

        //length
        System.out.println(s2.length());

        //isEmpty return boolean true or false
        System.out.println(s2.isEmpty());

        
        //isblank;
        System.out.println(s1.isBlank());
        

        //charAt
        char c= s1.charAt(11);
        System.out.println(c);

        
        
    }
    
    
}
