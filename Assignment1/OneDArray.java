package Assignment1;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

      
        int[] arr = new int[n];

       
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }

    }
}
