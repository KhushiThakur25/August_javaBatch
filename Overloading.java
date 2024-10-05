public class Overloading {
    public void display(int a){
        System.out.println("Integer is: "+a);
    }
    public void display(Double a){
        System.out.println("Double is: "+a);
    }
    public void display(int a, int b){
        System.out.println("Sum of a and b is : "+(a+b));
    }
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.display(22,63);
    }
}
