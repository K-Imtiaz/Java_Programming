import java.util.Scanner;

public class Switch_vs_If_Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= scanner.nextInt();
        switch (n) {
            case 10:
                System.out.println("N is 10");
                break;
            case 90:
                System.out.println("N is 90");
                break;
            case 100:
                System.out.println("N is 100");
                break;
            case -3:
                System.out.println("N is -3");
                break;
            default:
                System.out.println("None of this above");
        }

    }
}