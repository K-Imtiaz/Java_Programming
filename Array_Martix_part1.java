import java.util.Scanner;

public class Array_Martix_part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][]A=new int [2][3];
        int[][]B=new int [2][3];

        //for getting Data
        System.out.print("Enter A: \n ");
        for (int row=0; row<2; row++) {
            for (int col=0; col<3; col++){
                System.out.printf("A[%d][%d] = ",row,col);
                A[row][col]=scanner.nextInt();
            }
        }
        //for getting Data
        System.out.print("Enter B: \n ");
        for (int row=0; row<2; row++) {
            for (int col=0; col<3; col++){
                System.out.printf("B[%d][%d] = ",row,col);
                B[row][col]=scanner.nextInt();
            }
        }

        //for printing data A
        System.out.println("A : ");
        for (int row=0; row<2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+ A[row][col]);
            }
            System.out.println("");
        }

        //for printing data B
        System.out.println("B : ");
        for (int row=0; row<2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+ B[row][col]);
            }
            System.out.println("");
        }
        //add A and B matrix
        System.out.println("A+B: ");
        for(int row=0;row<3;row++){
            for(int col=0; col<3;col++){
                System.out.print("\t "+A[row][col]+B[row][col]);

            }
            System.out.println();
        }










        }

    }