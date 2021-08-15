/**
 * StringDataTypes
 */
public class StringDataTypes {

   public static void main(String[] args) {
       String s1="Imtiaz Academy";
       //upper case,lower case;
       System.out.println(s1.toUpperCase());
       String s2=s1.toLowerCase();
       System.out.println(s2);


       //length
       System.out.println(s1.length());
    
       //isEmpty,isBlacnk
       System.out.println(s1.isEmpty());
       System.out.println(s1.isBlank());

       //charAt
       char c=s1.charAt(5);
        System.out.println(c);

        //
        String I1 = "ABCDEFGHIJKLJ";
        System.out.println(I1.length());
        System.out.println(I1.indexOf("G"));
        System.out.println(I1.lastIndexOf("J"));


        //concat
        String S4=I1.concat("KLMNOPQRSTUVWXYZ");
        System.out.println(S4);

   }
}