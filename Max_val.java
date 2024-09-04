import java.util.Arrays;

public class Max_val {
    public static void main(String[] args) {
        // int arr1[] = { 2, 3, 64, 9, 4 };
        // Arrays.sort(arr1);
        // for (int i = 0; i < arr1.length; i++) {
        // System.out.print(arr1[i] + " ");
        // }
        // System.out.println();
        // System.out.println("Maximum value is on last index:" + arr1[arr1.length -
        // 1]);

        int arr1[] = { 2, -3, -64, 9, 4 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("Maximum value is: " + max);
    }
}
