//polymorphism - a single action in differents ways..
// compile time polymorphism - overload
// run time polymorphism - override 
//B is a A
//B has a A
//IS-a
//Has - a
class Bank {
    float getRateOfInterest() {
        return 0;
    }
    void display(){
        System.out.println("Hello");
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
    void display(){
        System.out.println("bye..");
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class PolyMorphism {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("SBI Rate of interest:" + b.getRateOfInterest());
        b.display();
    }
}
