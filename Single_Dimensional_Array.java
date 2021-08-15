import java.util.Scanner;

public class Single_Dimensional_Array {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] numbers = new double[5];
    double sum=0;
    double average;

    System.out.print("Enter 5 numbers: ");
    for (int i=0; i<numbers.length; i++) {
        numbers[i] = scanner.nextDouble();
    }
        for (int i=0; i< numbers.length; i++) {
            sum =sum+numbers[i];
        }
        System.out.println("The sum is "+sum);
        average =sum/numbers.length;
        System.out.println("The average is : "+average);
    }


}