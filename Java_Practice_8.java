import java.util.Scanner;

//Java Program to Check Whether a Number is Even or Odd
public class Java_Practice_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        if (n%2 ==0)
            System.out.println("Even");
        else if (n%2 == 1)
            System.out.println("ODD");
    }
}