import java.util.Scanner;

public class If_Else_Statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= scanner.nextInt();
        if (n%2 == 0) {
            System.out.println("Even");

        }else{
            System.out.println("ODD");
        }

    }
}