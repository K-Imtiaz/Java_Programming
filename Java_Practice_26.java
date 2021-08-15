import java.util.Scanner;
//Java Program to Find Factorial of a Number Using Recursion
public class Java_Practice_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int factorial =PowerNumber(num);
        System.out.println("Factorial of "+ num+ " is "+factorial);

    }   public static int PowerNumber(int num) {
        if (num>=1)
            return num*PowerNumber(num-1);
        else
            return 1;
            
    }
}