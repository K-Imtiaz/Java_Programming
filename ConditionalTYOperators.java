package Java;
public class ConditionalTYOperators {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int max= ((a>b)?a:b);
        System.out.println(max);

        String name="";
        System.out.println(name.isEmpty()?"The name is not valid" : name);
        

    }
    
}
