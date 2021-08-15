import java.util.Scanner;
//Java Program to Check Palindrome
public class Java_Practice_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        int r,temp,sum=0;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;

        }
        if(sum==temp){
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not Palindrome.");
        }
    }
}