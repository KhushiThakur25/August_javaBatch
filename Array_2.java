import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int[][] a = { { 1, 2, 3, 5 }, { 4, 5, 6, 8 }, { 7, 8, 9, 1 } };
        Scanner sc = new Scanner(System.in);
        // System.out.println(arr.length);
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.println("Enter the values:" + row + " " + col);
                int n = sc.nextInt();
                arr[row][col] = n;
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


