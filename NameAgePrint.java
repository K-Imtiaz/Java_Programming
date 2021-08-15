import java.util.Scanner;

public class NameAgePrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        int age= input.nextInt();
        System.out.println(name+'!'+"Your age is "+age+".");

    }
    
}
