import java.util.Scanner;
// fibonacci number
//7
public class Java_Practice_4 {
    public static void main(String[] args) {

        int first_number =0;
        int second_number =1;

        System.out.println("How many do you want?\n");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0; i<10; i++) {
            int fibo=first_number+second_number;
            System.out.print(" "+fibo);
            first_number=second_number;
            second_number=fibo;
        }
    }
}