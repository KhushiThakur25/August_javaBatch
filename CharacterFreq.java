import java.util.HashMap;

public class CharacterFreq {
    public static void main(String[] args) {
        String st = "Hello world";
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : st.toCharArray()) {
            if (c != ' ') {
                if (freqMap.containsKey(c)) {
                    freqMap.put(c, freqMap.get(c) + 1);
                } else {
                    freqMap.put(c, 1);
                }
            }
        }
        for (char c : freqMap.keySet()) {
            System.out.println(c + " : " + freqMap.get(c));
        }
    }
}
