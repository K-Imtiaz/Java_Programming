import java.util.Scanner;

public class OperatorCalculator {
    /**
     * InnerOperatorCalculator
     */
    public class InnerOperatorCalculator {
    public static void main(String[] args) {
        System.out.println("Enter number 1 operator and number 2: ");
        Scanner f= new Scanner(System.in);
        double d1=f.nextDouble();
        char OP=f.next().charAt(0);
        double d2=f.nextDouble();


        if(OP=='+') 
        System.out.println((int)(d1+d2));
        else if(OP=='-') 
        System.out.println((int)(d1-d2));
        else if(OP=='/')
        System.out.println((int)(d1/d2));
        else if(OP=='*')
        System.out.println((int)(d1*d2));

    
    }
        
    }
    
}
