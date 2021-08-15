//Print 1 to n number addition
public class Java_Practice_7 {

    public static void main(String[] args) {
        int num = 100;
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is : "+sum);
    }
}