package Assignment1;

import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

       
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

       
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix, rows, cols);

        System.out.println("\nTranspose of the Matrix:");
        printMatrix(matrix, cols, rows, true);

        scanner.close();
    }

   
    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

   
    public static void printMatrix(int[][] matrix, int rows, int cols, boolean transpose) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
