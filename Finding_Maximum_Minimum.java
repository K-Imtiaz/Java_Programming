import java.util.Scanner;

public class Finding_Maximum_Minimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] number= new double[5];
        double sum=0;
        System.out.print("Enter 5 numbers: ");
        for (int i=0; i<number.length; i++){
            number[i]= scanner.nextDouble();
        }
        for(int i=0; i<number.length; i++){
            sum+=number[i];
        }
        System.out.println("The sum is : "+sum);
        System.out.println("The avarage number is : "+sum/number.length);

        double max=number[0];
        double min=number[0];
        for(int i=1; i<number.length; i++){
            if(max<number[i]){
                max=number[i];
            }if(min> number[i]){
                min=number[i];
            }

        }System.out.println("The maximum number is "+max);
        System.out.println("The minimum number is "+min);

    }
}