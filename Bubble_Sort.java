import java.util.Arrays;
public class Bubble_Sort {
    public static void main(String[] args) {
        int[]array={6,-3,1,2,4,5,7,0};
        print(Arrays.toString(array));
        for (int i = 0, size= array.length; i<size-1; i++) {
            for (int j = 0; j < size-1-i; j++) {
                if (array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }print(Arrays.toString(array));

    }

    private static void print(String s) {
        System.out.println(s);
    }
}