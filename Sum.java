import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int a = sc.nextInt();
        System.out.println("Enter the second value:");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum of a and b is :" + c);
    }
}
