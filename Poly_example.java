// parent class
class Animal{
    public void sound(){
        System.out.println("Animal makes a sound..");
    }
}
// child class
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks..");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("cat meows..");
    }
}
public class Poly_example {
    public static void main(String[] args) {
        Animal obj = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        obj.sound();
        dog.sound();
        cat.sound();
    }
}
