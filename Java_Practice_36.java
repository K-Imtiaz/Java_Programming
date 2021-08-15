import java.util.Scanner;

public class Java_Practice_36 {
    //Java Program to Find the Sum of Natural Numbers using Recursion
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sum=addNumbers(number);
        System.out.println("Sum is "+sum);

    }
    public static int addNumbers(int number) {
        if(number!=0)
            return number+addNumbers(number-1);
        else
            return number;
    }
}