import java.util.Scanner;

/**
 * ReadingInput
 */
public class ReadingInput {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Integer: "+input.nextInt());
        System.out.println(" double: "+input.nextDouble());
       System.out.println(" float"+input.nextFloat());
       System.out.println(" Boolean"+input.nextBoolean());
       System.out.println(" anything is good here "+input.nextLine());
    }
}