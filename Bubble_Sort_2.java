import java.util.Arrays;

public class Bubble_Sort_2 {
    public static void main(String[] args) {
        int[]arr={9,8,7,-1,0,3,4,5,32,2};
        print(Arrays.toString(arr));
        for (int i=0, size=arr.length; i<size-1; i++) {
            for (int j=0; j<size-1-i; j++) {

                if(arr[j]>arr[j+1])
                {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }

            }


        }print(Arrays.toString(arr));
    }

    private static void print(String s) {
        System.out.println(s);
    }
}