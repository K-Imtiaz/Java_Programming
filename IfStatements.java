public class IfStatements {
    public static void main(String[] args) {
        if(true)
        System.out.println("hello");
        if(false) //will not execute
        System.out.println("hello");


        if(true){
            System.out.println("Inside the if statement");
       
        System.out.println("Outside the if statement");
        }
        if(false){
            System.out.println("Inside the if statement");
            System.out.println("Outside the if statement");
            
        }
        if(true){
            System.out.println("Inside the if statement");
            System.out.println("Inside the if statement");
        }
        System.out.println("Outside the if statement");
        if(false){
            System.out.println("Inside the if statement");
            System.out.println("Inside the if statement");
        }
        System.out.println("Outside the if statement");
    }

}
