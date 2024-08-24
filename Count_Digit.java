public class Count_Digit {
    public static void main(String[] args) {
        int n = 3265456;
        int count = 0;
        while (n > 0) {
            count += 1;
            n /= 10;
        }
        System.out.println("Count of number are " + count);
    }
}
