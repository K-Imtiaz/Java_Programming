import java.util.Scanner;

public class while_loop_exercise {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        while(n<1 || n>10) {
            System.out.print(n + " is not between 1 to 10.Try again.");
           n=scanner.nextInt();
        }

        System.out.println(n+" is between 1 to 10.Thanks.");
}
}