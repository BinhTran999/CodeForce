import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem1B_Spreadsheets {

    public static HashMap<String, Integer> alphabetMap = new HashMap<>() {{
        put("A", 1);
        put("B", 2);
        put("C", 3);
        put("D", 4);
        put("E", 5);
        put("F", 6);
        put("G", 7);
        put("H", 8);
        put("I", 9);
        put("J", 10);
        put("K", 11);
        put("L", 12);
        put("M", 13);
        put("N", 14);
        put("O", 15);
        put("P", 16);
        put("Q", 17);
        put("R", 18);
        put("S", 19);
        put("T", 20);
        put("U", 21);
        put("V", 22);
        put("W", 23);
        put("X", 24);
        put("Y", 25);
        put("Z", 26);
    }};

    public static void main(String[] args){

    }

    public static String change(String t){
        if (isRaCb(t)){
            return RaCb(t);
        }
        return BA(t);
    }

    public static boolean isRaCb(String str){
        return str.matches("R[{0-9}+]+C[{0-9}+]+");
    }

    public static String RaCb(String input){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
                    int number = Character.getNumericValue(input.charAt(i + 1));
                    map.put(ch, number);
                    i++;
                }
            }
        }

        int a = map.get('R');
        int b = map.get('C');
        return "";
    }

    public static String BA(String input){
        Pattern pattern = Pattern.compile("([A-Z]+[0-9]+){1}");
        Matcher matcher = pattern.matcher(input);
        String letters = matcher.group(1);
        String numbers = matcher.group(2);
        String[] words = letters.split("\\s+");
        int length = words.length - 1;
        int m = 0;
        for (String s : words) {
            m += length*alphabetMap.get(s)*26;
            length--;
        }
        return "";
    }
}
