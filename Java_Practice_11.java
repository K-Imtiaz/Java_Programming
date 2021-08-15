import java.util.Scanner;

//Java Program to Check Leap Year
public class Java_Practice_11 {
    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year %4==0 )
            System.out.println("Leap year.");
        else if (year%100==0)
            System.out.println("Leap year");
        else
            System.out.println("Not leap Year.");
    }
}