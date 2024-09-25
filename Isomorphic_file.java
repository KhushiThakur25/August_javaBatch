import java.util.HashMap;

public class Isomorphic_file {
    public static boolean isIsomorphic_file(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character v1 = s.charAt(i);
            Character v2 = t.charAt(i);
            if (map.containsKey(v1)) {
                if (map.get(v1) != v2) {
                    return false;
                }
            } else if (map.containsValue(v2)) {
                return false;
            } else {
                map.put(v1, v2);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        if (isIsomorphic_file(s, t)) {
            System.out.println("It is an isomorphic..");
        } else {
            System.out.println("It isn't isomorphic..");
        }
    }
}
