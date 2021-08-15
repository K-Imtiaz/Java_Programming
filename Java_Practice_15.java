//Java Program to Find Factorial of a Number
import java.util.Scanner;

public class Java_Practice_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Number=scanner.nextInt();
        int i =1;
        int factorial=1;
        while (i<=Number){
            factorial=factorial*i;
            i++;
        }
            System.out.println("factorial is : "+factorial);



    }
}