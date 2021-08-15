public class Java_Practice_20 {
    //Java Program to Calculate the Power of a Number
    public static void main(String[] args) {
        int base=2;
        int exponent=3;
        int Power=1;
        for (; exponent!=0;exponent--)
        {
            Power=Power*base;
        }
        System.out.println(Power);
    }
}