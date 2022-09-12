import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");


    public static void main(String[] args) {
        Map<Character, Integer> charCount = new HashMap<>();
        int symbolSum = 1;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if
            (!charCount.containsKey(symbol) && Character.isLetter(symbol)) {
                charCount.put(symbol, symbolSum);
            }
            if
            (charCount.containsKey(symbol)) {
                symbolSum++;
                charCount.put(symbol, symbolSum);
            }
        }

        int maxValue = -1;
        for (int value : charCount.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        int minValue = Integer.MAX_VALUE;
        for (int value : charCount.values()) {
            if (value < minValue) {
                minValue = value;
            }
        }
    }


}
