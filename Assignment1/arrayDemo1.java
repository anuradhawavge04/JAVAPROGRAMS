package Assignment1;

import java.util.Scanner;

public class arrayDemo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ----- 1D Array -----
        int[] arr1D = new int[3];
        System.out.println("Enter 3 elements for 1D array:");
        for (int i = 0; i < 3; i++) {
            arr1D[i] = sc.nextInt();
        }

        System.out.print("1D Array: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr1D[i] + " ");
        }
        System.out.println("\n");

        // ----- 2D Array -----
        int[][] arr2D = new int[2][2];
        System.out.println("Enter 4 elements for 2D array (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // ----- 3D Array -----
        int[][][] arr3D = new int[2][2][2];
        System.out.println("Enter 8 elements for 3D array (2x2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr3D[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("3D Array:");
        for (int i = 0; i < 2; i++) {
            System.out.println("matrix " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
