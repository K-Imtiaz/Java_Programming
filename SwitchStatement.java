/**
 * SwitchStatement
 */
public class SwitchStatement {

    public static void main(String[] args) {
        int n=6; 
        //change n for different cases
        switch (n) {
            case 10:
            System.out.println(" =10");
            case 90:
            System.out.println(" =90");
            case -3:
            System.out.println(" =-3");
            default:
            System.out.println("None of this above");
        }
    }
}