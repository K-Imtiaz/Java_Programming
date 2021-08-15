import java.util.Scanner;

public class Even_odd_by_if_statements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        if(n%2==0){
            System.out.println("Number is even");
    }
    if(n%2==1){
        System.out.println("The number is odd.");
    }
    }

}