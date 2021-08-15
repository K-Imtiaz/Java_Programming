public class Java_Practice_10 {
    public static void main(String[] args) {
        int n1=10;
        int n2=15;
        int n3=20;
        if(n1>n2)
            System.out.println("n1 is bigger than n2.");
        else if(n2>n3)
                System.out.println("n2 is bigger than n3.");
        else if(n3>n1)
                System.out.println("n3 is bigger than n1.");
        else if(n1==n2 && n2==n3 && n3==n1)
            System.out.println("All numbers are equal.");


    }
}