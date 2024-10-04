class Animal {
    void eat() {
        System.out.println("eating..");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking..");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping..");
    }
}

public class Inherutance_multilevel {
    public static void main(String[] args) {
        BabyDog jemmy = new BabyDog();
        jemmy.weep();
        jemmy.bark();
        jemmy.eat();
    }
}
