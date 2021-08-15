import java.util.Scanner;

public class Nested_If_Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= scanner.nextInt();
        if(n>10) {
            System.out.print("N is >10. ");
        }
            else if(n==10){
            System.out.print("N is =10.");
        }
            else
            System.out.println("N is <10.");







    }
}