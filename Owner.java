abstract class Car{
    abstract void start();
    void stop(){
        System.out.println("Car engine is started");
    }
}


public class Owner extends Car{
    void start(){
        System.out.println("The car engine has been started..");
    }
    public static void main(String[] args) {
        Owner ram = new Owner();
        ram.start();
        ram.stop();
    }
}

// public class Abstraction_oops extends Demo {
//     void display(){
//         System.out.println("This the homepage");
//     }
//     public static void main(String[] args) {
//         Abstraction_oops obj = new Abstraction_oops();
//         obj.display();
//     }
// }
