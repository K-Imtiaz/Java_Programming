public class Infinite_Loops_By_While {
    public static void main(String[] args) {
        {
            //infinite loops
            int i = 1;
            while (i <= 5)
                System.out.println("hello " + i);
            // i--;
        }
        {
            while (true)
                System.out.println("hello");
        }
    }
}