public class IfElse {
    public static void main(String[] args) {
        {
            if(true) {
                System.out.println("Inside the if statement");
            }else
            System.out.println("Inside the else statement");
        }
        System.out.println("Outside if - else statement");
        {
            {
                if(false) {
                    System.out.println("Inside the if statement");
                }else
                System.out.println("Inside the else statement");
            }
            System.out.println("Outside if - else statement");
        }
    }
    
}
