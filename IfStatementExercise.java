import java.util.Scanner;

public class IfStatementExercise {
    public static void main(String[] args) {
        {
            System.out.print("Enter a number: ");
        Scanner s= new Scanner(System.in);
        int number=s.nextInt();

        if(number %2== 0){
            System.out.println("Your given number is even.");
        }
        // System.out.println("Your given number is odd.");
        /* if(number%2==1){
            System.out.println("Your given number is odd.");
        } */
        if(!(number%2==0)){
            System.out.println("Your given number is odd.");
                }
            }
      {     
          System.out.println("Enter a Number.");
          Scanner Ss= new Scanner(System.in);
          int n=Ss.nextInt();
          if(n%2== 0){
              System.out.println("This is even.");
          }else{
              System.out.println("This is an odd number");
          }
      }      

}
}

