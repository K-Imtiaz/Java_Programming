import javax.swing.plaf.metal.MetalPopupMenuSeparatorUI;

public class IfExercise {
    public static void main(String[] args) {
        int x=10;
        int y= 15;
        if (x>y)
        {
            System.out.println("X is greater than Y :"+x);
        }
        if (x<y)
        {
            System.out.println("Y is greater than X: "+y );
        }
        if(y==x){
            System.out.println("X and Y are equal.");
        }
    }
}
