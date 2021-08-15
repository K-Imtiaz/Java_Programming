import java.util.Scanner;
//Java Program to Reverse a Number
public class Java_Practice_19 {
    //Java Program to Reverse a Number
    public static void main(String[] args) {
        int reverse=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n=scanner.nextInt();
        while(n!=0){

            int Number=n%10;
            reverse=reverse*10+Number;
            n=n/10;

        }
        System.out.println("Reverse Number is "+reverse);


    }
}