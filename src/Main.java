import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


    public static void main(String[] args) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if
            (!Character.isLetter(symbol)) {
                continue;
            }

            if (charCount.containsKey(symbol)) {

                charCount.put(symbol, charCount.get(symbol) + 1);
            } else {
                charCount.put(symbol, 1);
            }

        }

        int maxValue = -1;
        char max = 0;
        for (char value : charCount.keySet()) {
            int frecMax = charCount.get(value);
            if (frecMax > maxValue) {
                maxValue = frecMax;
                max = value;
            }

        }
        System.out.println(" max  " + max + " " + maxValue);

        int minValue = Integer.MAX_VALUE;
        char min = 0;
        for (char value : charCount.keySet()) {
            int frecMin = charCount.get(value);
            if (frecMin < minValue) {
                minValue = frecMin;
                min = value;
            }
        }
        System.out.println(" min  " + min + " " + minValue);
    }


}
