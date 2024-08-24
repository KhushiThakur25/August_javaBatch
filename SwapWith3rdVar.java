public class SwapWith3rdVar {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("Before swapping a and b are: " + a + " , " + b);
        // int temp = a;
        // a = b;
        // b = temp;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("After swapping a and b are: " + a + " , " + b);
    }
}
