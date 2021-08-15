import java.util.Scanner;

/**
 * CaseBreakAssignment
 */
public class CaseBreakAssignment {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        switch (n%2) {
            case 0:
            System.out.println("Even");
            break;
            case 1:
            System.out.println("Odd");
        }

    }
}