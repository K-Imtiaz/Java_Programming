import java.util.Scanner;

public class Sum_Of_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of A: \n ");
        int[][] A = new int[3][3];
        int sumOfDiagonal = 0;
        int sumOfUpperElement = 0;
        int sumOfLowerElement = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]: ", row, col);
                A[row][col] = scanner.nextInt();

            }

        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sumOfDiagonal = sumOfDiagonal + A[row][col];
                }
                if (row < col) {
                    sumOfUpperElement = sumOfUpperElement + A[row][col];
                }
                if (row > col) {
                    sumOfLowerElement = sumOfLowerElement + A[row][col];
                }

            }
        }
        System.out.println("Sum of Diagonal Elements: " + sumOfDiagonal);
        System.out.println("Sum of Upper Elements: " + sumOfUpperElement);
        System.out.println("Sum of lower Elements: " + sumOfLowerElement);
    }

}