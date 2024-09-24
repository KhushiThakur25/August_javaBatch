import java.util.HashMap;

public class HashMap_file {
    public static void main(String[] args) {
        HashMap<String, Integer> stMarks = new HashMap<>();
        stMarks.put("Ram", 85);
        stMarks.put("Aman", 73);
        stMarks.put("Jay", 92);
        // System.out.println("Ram's marks: " + stMarks.get("Ram"));
        for (String key : stMarks.keySet()) {
            System.out.println(key + "'s marks : " + stMarks.get(key));
        }
        if (stMarks.containsValue(85)) {
            System.out.println("Yes , it is present..");
        } else {
            System.out.println("Not present..");
        }
        System.out.println(stMarks.values());
        stMarks.remove("Aman");
        System.out.println(stMarks.size());
        if (stMarks.isEmpty()) {
            System.out.println("Yes, it is empty..");
        } else {
            System.out.println("It has elements..");
        }
    }

}
