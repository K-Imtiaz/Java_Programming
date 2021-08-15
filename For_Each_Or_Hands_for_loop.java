public class For_Each_Or_Hands_for_loop {
    public static void main(String[] args) {
        String[] names = {"Shimul","Fahim","Shishir","Shuvo"};
        for(String name : names){
            System.out.println(name);
        }
        {
            int[] num={10,20,30,40,50,60,70};
            int sum=0;
            for( int x : num){
                sum=sum+x;

            }
            System.out.print(" "+sum);

        }
    }
}