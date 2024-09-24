import java.util.*;

public class ArrayList_file {
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("third fruit: " + fruits.get(2));
        fruits.remove(1);
        System.out.println("Size of the list :" + fruits.size());
        if (fruits.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList having elements..");
        }
        fruits.set(0, "grapes");
        System.out.println("third fruit: " + fruits.get(0));
        System.out.println("Size of the list :" + fruits.size());
        fruits.add(0, "Mango");
        System.out.println("Size of the list :" + fruits.size());
        fruits.clear();
        System.out.println("Size of the list :" + fruits.size());
    }
}
