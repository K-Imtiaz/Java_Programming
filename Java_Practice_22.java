public class Java_Practice_22 {
    //Java Program to Swap Two Numbers
    public static void main(String[] args) {
        float number1=10.2f;
        float number2=30.7f;


        System.out.println("Before swapping: ");
        System.out.println("Number 1: "+number1);
        System.out.println("Number 2: "+number2);

        number1=number1-number2;
        number2=number1+number2;
        number1=number2-number1;

        System.out.println("After swapping: ");
        System.out.println("Number 1: "+number1);
        System.out.println("Number 2: "+number2);

    }
}