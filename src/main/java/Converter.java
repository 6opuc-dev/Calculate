import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Converter {
    int num;

    public int romanToArabic(String str) {
        switch (str) {
            case "I":
                num = Roman.I.getValue();
                break;
            case "II":
                num = Roman.II.getValue();
                break;
            case "III":
                num = Roman.III.getValue();
                break;
            case "IV":
                num = Roman.IV.getValue();
                break;
            case "V":
                num = Roman.V.getValue();
                break;
            case "VI":
                num = Roman.VI.getValue();
                break;
            case "VII":
                num = Roman.VII.getValue();
                break;
            case "VIII":
                num = Roman.VIII.getValue();
                break;
            case "IX":
                num = Roman.IX.getValue();
                break;
            case "X":
                num = Roman.X.getValue();
                break;
        }
        return num;
    }

    public String ArabicToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        String[] str = {"C", "XC", "LXXX", "LXX", "LX", "L", "XL", "XXX", "XX", "X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
        int i = 0;
        while (num > 0 && i < str.length ) {
            String currentSymbol = str[i];
            int currentSymbolValue = 0;
            switch (currentSymbol) {
                case "I":
                    currentSymbolValue = Roman.I.getValue();
                    break;
                case "II":
                    currentSymbolValue = Roman.II.getValue();
                    break;
                case "III":
                    currentSymbolValue = Roman.III.getValue();
                    break;
                case "IV":
                    currentSymbolValue = Roman.IV.getValue();
                    break;
                case "V":
                    currentSymbolValue = Roman.V.getValue();
                    break;
                case "VI":
                    currentSymbolValue = Roman.VI.getValue();
                    break;
                case "VII":
                    currentSymbolValue = Roman.VII.getValue();
                    break;
                case "VIII":
                    currentSymbolValue = Roman.VIII.getValue();
                    break;
                case "IX":
                    currentSymbolValue = Roman.IX.getValue();
                    break;
                case "X":
                    currentSymbolValue = Roman.X.getValue();
                    break;
                case "L":
                    currentSymbolValue = Roman.L.getValue();
                    break;
                case "C":
                    currentSymbolValue = Roman.C.getValue();
                    break;
                case "XX":
                    currentSymbolValue = Roman.XX.getValue();
                    break;
                case "XXX":
                    currentSymbolValue = Roman.XXX.getValue();
                    break;
                case "XL":
                    currentSymbolValue = Roman.XL.getValue();
                    break;
                case "LX":
                    currentSymbolValue = Roman.LX.getValue();
                    break;
                case "LXX":
                    currentSymbolValue = Roman.LXX.getValue();
                    break;
                case "LXXX":
                    currentSymbolValue = Roman.LXXX.getValue();
                    break;
                case "XC":
                    currentSymbolValue = Roman.XC.getValue();
                    break;
            }
            if(currentSymbolValue <= num) {
                sb.append(str[i]);
                num -= currentSymbolValue;
            }else {
                i++;
            }
        }
        return  sb.toString();
    }
}
