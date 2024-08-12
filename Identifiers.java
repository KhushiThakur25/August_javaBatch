public class Identifiers {
    public static void main(String[] args) {
        int value = 10;
        int value_2 = 20;
        int student_rollNo = 32;
        char gender = 'm';
        float val = 2.3f;
        boolean prime = false;

        // Arithmetic operator
        int result = value + value_2;
        int result1 = value - value_2;
        int result2 = value * value_2;
        int result3 = value / value_2; // quotient
        int result4 = value % value_2; // remainder

        // operator = +
        // operands = value,value_2;
        System.out.println("Sum of value and value_2 is:" + result);
        System.out.println("Sub of value and value_2 is:" + result1);
        System.out.println("mul of value and value_2 is:" + result2);
        System.out.println("div of value and value_2 is:" + result3);
        System.out.println("Modulus of value and value_2 is:" + result4);

        // Assignment operator
        int a = 5;
        int b = 6;
        int sum = 10;
        int sum1 = 20, sum2 = 30, sum3 = 15, sum4 = 22;
        // sum = sum + a;
        // sum = sum + a;
        sum += b;
        sum1 -= a;
        sum2 *= a;
        sum3 /= b;
        sum4 %= b;
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

    }
}
