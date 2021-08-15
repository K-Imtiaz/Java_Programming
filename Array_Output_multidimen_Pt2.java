public class Array_Output_multidimen_Pt2 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][];
        int k=0;
        numbers[0] = new int[1];
        numbers[1] = new int[2];
        numbers[2] = new int[3];
        numbers[3] = new int[4];


        for (int r=0; r<4; r++){
            for (int c=0; c<r+1; c++){
               numbers[r][c] = k;
               k++;

            }
        }
        for (int r=0; r<4; r++){
            for (int c=0; c<r+1; c++){
                System.out.print(" "+numbers[r][c]);
            }
            System.out.println();
        }


    }
}