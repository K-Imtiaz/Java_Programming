import java.util.Scanner;

public class Do_While_Loop_Exercise_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter a number between 1 and 10: ");
            n=scanner.nextInt();
        }
        while(n<1 || n>10);
        System.out.println(n+" is between 1 and 10");
    }

}