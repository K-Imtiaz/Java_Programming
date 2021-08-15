import java.util.Scanner;
//Java Program to Check Whether a Number is Positive or Negative
public class Java_Practice_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=scanner.nextInt();
        if(n<0)
            System.out.println("Negative");
        else
            System.out.println("positive");
    }
}