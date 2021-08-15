import java.util.Scanner;
//Java Program to Check Whether a Character is Alphabet or Not
public class Java_Practice_13 {
    public static void main(String[] args) {
        char c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter anthing: ");
        c = scanner.next().charAt(0);

        if((c>='a'&& c<='z')|| (c>='A'&& c<='Z'))
            System.out.println("Alphabet");
        else
            System.out.println("Not Alphabet");

    }
}