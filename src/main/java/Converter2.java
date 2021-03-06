import java.util.LinkedHashMap;

public class Converter2 {

    public int convert(String str) {
        final LinkedHashMap<String, Integer> rom = new LinkedHashMap<>();
        rom.put("C", 100);
        rom.put("XC", 90);
        rom.put("LXXX", 80);
        rom.put("LXX", 70);
        rom.put("LX", 60);
        rom.put("L", 50);
        rom.put("XL", 40);
        rom.put("XXX", 30);
        rom.put("XX", 20);
        rom.put("X", 10);
        rom.put("IX", 9);
        rom.put("VIII", 8);
        rom.put("VII", 7);
        rom.put("VI", 6);
        rom.put("V", 5);
        rom.put("IV", 4);
        rom.put("III", 3);
        rom.put("II", 2);
        rom.put("I", 1);
        return rom.get(str);
    }

    public String convert(int num) {
        final LinkedHashMap<String, Integer> rom = new LinkedHashMap<>();
        rom.put("C", 100);
        rom.put("XC", 90);
        rom.put("LXXX", 80);
        rom.put("LXX", 70);
        rom.put("LX", 60);
        rom.put("L", 50);
        rom.put("XL", 40);
        rom.put("XXX", 30);
        rom.put("XX", 20);
        rom.put("X", 10);
        rom.put("IX", 9);
        rom.put("VIII", 8);
        rom.put("VII", 7);
        rom.put("VI", 6);
        rom.put("V", 5);
        rom.put("IV", 4);
        rom.put("III", 3);
        rom.put("II", 2);
        rom.put("I", 1);

        final LinkedHashMap<Integer, String> arabic = new LinkedHashMap<>();
        arabic.put(100, "C");
        arabic.put(90, "XC");
        arabic.put(80, "LXXX");
        arabic.put(70, "LXX");
        arabic.put(60, "LX");
        arabic.put(50, "L");
        arabic.put(40, "XL");
        arabic.put(30, "XXX");
        arabic.put(20, "XX");
        arabic.put(10, "X");
        arabic.put(9, "IX");
        arabic.put(8, "VIII");
        arabic.put(7, "VII");
        arabic.put(6, "VI");
        arabic.put(5, "V");
        arabic.put(4, "IV");
        arabic.put(3, "III");
        arabic.put(2, "II");
        arabic.put(1, "I");

        StringBuilder strb = new StringBuilder();
        for (int i : rom.values()) {
            if (i <= num) {
                strb.append(arabic.get(i));
                num -= i;
            }
        }
        return strb.toString();
    }
}
