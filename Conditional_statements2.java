public class Conditional_statements2 {
    public static void main(String[] args) {
        int a = 56;
        int b = 32;
        int c = 9;
        if ((a > b) && (a > c)) {
            System.out.println("a is greatest");
        } else if ((b > a) && (b > c)) {
            System.out.println("b is greatest");
        } else {
            System.out.println("c is greatest");
        }
    }
}
