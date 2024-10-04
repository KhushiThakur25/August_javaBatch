
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
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing..");
    }
}
public class Multiple_inhert {

    public static void main(String[] args) {
        Dog tom = new Dog();
        tom.bark();
        tom.eat();
    }

    
}

