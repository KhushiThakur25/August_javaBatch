import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of physics,chemistry,hindi,maths,english");
        int py = sc.nextInt();
        int ch = sc.nextInt();
        int hi = sc.nextInt();
        int ma = sc.nextInt();
        int en = sc.nextInt();
        int per = py + ch + hi + ma + en;
        per = per / 5;
        System.out.println("Percentage of the student is: " + per);
        if (per >= 90) {
            System.out.println("Student has grade A");
        } else if (per <= 89 && per >= 70) {
            System.out.println("Student has grade B");
        } else if (per <= 69 && per >= 50) {
            System.out.println("Student has grade C");
        } else {
            System.out.println("Student has grade D");
        }
    }
}
