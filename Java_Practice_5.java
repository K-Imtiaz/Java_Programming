//How to generate random number in java
import java.util.Random;
//random number
//8
public class Java_Practice_5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(1000);
        System.out.println("Random Number= "+randomNumber);


        int randomNumb=(int) (Math.random()*100);
        System.out.println("Random Number is "+randomNumb);
    }
}