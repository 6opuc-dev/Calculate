import java.util.LinkedHashMap;
import java.util.Map;

public class Converter2 {

    Map<String, Integer> roman = new LinkedHashMap<>() {{
        put("C", 100);
        put("XC", 90);
        put("LXXX", 80);
        put("LXX", 70);
        put("LX", 60);
        put("L", 50);
        put("XL", 40);
        put("XXX", 30);
        put("XX", 20);
        put("X", 10);
        put("IX", 9);
        put("VIII", 8);
        put("VII", 7);
        put("VI", 6);
        put("V", 5);
        put("IV", 4);
        put("III", 3);
        put("II", 2);
        put("I", 1);
    }};

    Map<Integer, String> arabic = new LinkedHashMap<>() {{
        put(100, "C");
        put(90, "XC");
        put(80, "LXXX");
        put(70, "LXX");
        put(60, "LX");
        put(50, "L");
        put(40, "XL");
        put(30, "XXX");
        put(20, "XX");
        put(10, "X");
        put(9, "IX");
        put(8, "VIII");
        put(7, "VII");
        put(6, "VI");
        put(5, "V");
        put(4, "IV");
        put(3, "III");
        put(2, "II");
        put(1, "I");
    }};

    public int convert(String str) {
        return roman.get(str);
    }

    public String convert(int num) {
        StringBuilder strb = new StringBuilder();
        for (int i : roman.values()) {
            if (i <= num) {
                strb.append(arabic.get(i));
                num -= i;
            }
        }
        return strb.toString();
    }
}