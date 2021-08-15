//6
//fahrenheit to Celcius
//celcius to fahrenheit
import java.util.Scanner;

public class Java_Practice_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Celcious: ");
        int n=scanner.nextInt();
        n=(n*(9/5)+(32));
        System.out.println("fahrenheit is : "+n);

        System.out.println("Celsius:");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter fahrenheit: ");
        int n2=scanner2.nextInt();
        n2=(n2-32)*5/9;
        System.out.println("Celsius is: "+n2);


    }
}