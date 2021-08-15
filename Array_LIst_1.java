import java.util.ArrayList;
 /*
 example of all methods are using in this program
 size
 add
 remove
 removeAll
 isEmpty
 contains
 indexOf
 set
 get
  */
public class Array_LIst_1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size: " + number.size());
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        //normal print
        System.out.println("Array Contains: " + number);
        //for each loop print
        /*for(int x: number) {
            System.out.print(" "+x);

        }*/
        /*Iterator itr=number.iterator();
        while(itr.hasNext()) {
            System.out.print(" "+itr.next());
         */
        System.out.println();
        System.out.println("size is "+number.size());
        /*
        number.remove(2);
        System.out.println("After removing contains: "+number);
        number.removeAll(number);
        System.out.println("After removing All number: "+number);
                  */  
        //number.clear();
        //System.out.println("After Clearing Arraylist contains: "+number);


        boolean check = number.isEmpty();
        System.out.println("Arraylist Empty: "+check);
        boolean contains = number.contains(20);
        System.out.println("20 is on the list: "+contains);

        int position =number.indexOf(40);
        System.out.println("the position on index 40 is "+position);

        number.set (3, 50) ;   //for replace a variable
        System.out.println("After setting: "+number);

        int x=number.get(0);
        System.out.println("Index is "+x);
    }
}