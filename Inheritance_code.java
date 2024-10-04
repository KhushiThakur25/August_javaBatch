class Animal{
    void eat(){
        System.out.println("eating..");
    }
    void locomtion(){
        System.out.println("locomotion..");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking..");
    }
}


public class Inheritance_code {
    public static void main(String[] args) {
        Dog tom = new Dog();
        tom.bark();
        tom.eat();
    }
}
