import java.util.Scanner;

public class Even_Odd_by_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= scanner.nextInt();
        switch (n%2) {
            case (0):
                System.out.println("Even");
                break;
            /*case 1:
                System.out.println("ODD");

             */
            default:
                System.out.println("ODD");
        }
    }
}