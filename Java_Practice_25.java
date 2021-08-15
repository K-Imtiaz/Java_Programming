import java.util.Scanner;
//Cgpa - pass or fail
public class Java_Practice_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int average = scanner.nextInt();
        char cgpa;
        if(average>=90){
            cgpa='A';
        }
        else if(average>=70){
            cgpa='B';
        }
        else if(average>=60){
            cgpa='p';
        }
        else {
            cgpa='f';
        }
        System.out.println("Cgpa is "+cgpa);

    }

}