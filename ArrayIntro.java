import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        // int[] arr = { 2, 3, 65, 9, 4 };
        // int arr1[] = {2,3,64,9,4};

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print((arr[i] + 2) + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        int[] a = new int[5];
        // int b[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the value for index: " + i);
            int n = sc.nextInt();
            a[i] = n;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
