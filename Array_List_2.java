import java.util.ArrayList;
import java.util.Collections;

public class Array_List_2 {
    public static void main(String[] args) {
        ArrayList <Integer> num1= new ArrayList<Integer>();
        ArrayList <Integer> num2= new ArrayList<Integer>();
        ArrayList <Integer> num3= new ArrayList<Integer>();
        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);
        System.out.println("Number 1 is: "+num1);

        num2.add(2);
        num2.add(1);
        num2.add(3);
        num2.add(4);
        num2.add(-3);
        num2.add(0);
        num2.add(-2);
        System.out.println("Number 2 is: "+num2);
        Collections.sort(num2);
        System.out.println("After sorting number 2 in ascending order: "+num2);
        Collections.sort(num2,Collections.reverseOrder());
        System.out.println("After sorting number 2 in descending order: "+num2);

        num3.addAll(num1);
        System.out.println("Number 3 is: "+num3);

        boolean result=num3.equals(num2);
        boolean result2=num3.equals(num1);
        System.out.println("Number 1 and number 2 are similar: "+result);
        System.out.println("Number 1 and number 3 are similar: "+result2);
    }
}