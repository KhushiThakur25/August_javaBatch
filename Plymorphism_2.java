class Bike {
    int speedlimit = 90;
}

class Honda extends Bike {
    int speedlimit = 150;
}

public class Plymorphism_2 {
    public static void main(String[] args) {
        Bike obj = new Honda();
        System.out.println(obj.speedlimit);
    }
}
