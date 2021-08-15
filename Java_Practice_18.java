import java.util.Scanner;
//Java Program to Count Number of Digits in an Integer
public class Java_Practice_18 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers: ");
        int n=scanner.nextInt();
        while (n!=0) {
            n=n/10;
            count++;

        }
        System.out.print("number of digits "+count );
    }
}