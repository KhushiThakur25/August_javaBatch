import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = sc.nextInt();
        int fact = 0;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial is : " + fact);
    }
}
