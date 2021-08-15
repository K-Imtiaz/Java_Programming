import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        System.out.println("My name is : "+myScanner.nextLine());

    }

}
