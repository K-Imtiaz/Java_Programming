//Java Program to Check Whether an Alphabet is Vowel or Consonant
import java.util.Scanner;

public class Java_Practice_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=scanner.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("Vowel.");
        else
            System.out.println("Consonant.");
    }
}