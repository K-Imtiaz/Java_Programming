import java.util.Scanner;

public class If_Else_Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four digits:");
        int n=scanner.nextInt();

        int fourtDigits = n%10;
        int thirdDigits = (n/10)%10;
        int secondDigits = (n/100)%10;
        int firstDigits = (n/1000)%10;

        if( firstDigits+ secondDigits == thirdDigits+ fourtDigits) {
            System.out.println("This is a lucky number");
        } else {
            System.out.println("This is not a lucky number");
        }
    }
}