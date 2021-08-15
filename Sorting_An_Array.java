import java.util.Arrays;

public class Sorting_An_Array {


    public static void main(String[] args) {
        //ascending  order
        System.out.println("Ascending Order: ");
        int [] numbers = {10,-3,5,25,11,10};
        Arrays.sort(numbers);
        for (int i = 0; i < 6; i++) {
            System.out.print(" "+numbers[i]);
        }
        System.out.println();

        System.out.println("Descending Order: ");
        for(int i = 5; i >=0; i--) {
            System.out.print(" "+numbers[i]);

        }
        System.out.println("Ascending order of an String: ");
        String[] names = {"Imtiaz","Shaba","Shimul","Fahim"};
        Arrays.sort(names);
        for (int i = 0; i < 4; i++) {
            System.out.print(" "+names[i]);
        }
        System.out.println();

        System.out.println("Descending order of an String: ");
        for (int i = 3; i >=0; i--) {
            System.out.print(" "+names[i]);
        }
    }
}