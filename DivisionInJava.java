package Java;

public class DivisionInJava {
    public static void main(String[] args) {
        int i1=3;
        int i2=2;
        double d1=2;

        System.out.println(i1/i2);
        System.out.println(i1/d1);
        //casting
        System.out.println((double) i1/i2);
        System.out.println(i1/(double) i2);
        System.out.println((double)i1/(double)i2);
        System.out.println((double)(i1/i2));

    }
    
}
