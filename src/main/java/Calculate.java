import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculate {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите выражение в формате \"число пробел оператор пробел число\"");
        System.out.println("Допустимы целые числа от 1 до 10. Арабские или римские. Допустимы операторы \"+\",\"-\",\"*\",\"/\".");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Pattern pt = Pattern.compile("^[1-9] [+\\-*/] [1-9]$|^10 [+\\-*/] 10$|^10 [+\\-*/] [1-9]$|^[1-9] [+\\-*/] 10$");
        Pattern romanPt = Pattern.compile("^[IV]{1,4} [+\\-*/] [IV]{1,4}$|^I?X? [+\\-*/] [IV]{1,4}$|^[IV]{1,4} [+\\-*/] I?X?$|^I?X? [+\\-*/] I?X?$");
        Matcher m = pt.matcher(str);
        Matcher romanM = romanPt.matcher(str.toUpperCase());
        Converter conv = new Converter();
        try {
            String[] numbers = str.toUpperCase().split(" ");
            if(m.find()){
                NumbersAndOperator nums = new NumbersAndOperator();
                nums.setNum1(Integer.parseInt(numbers[0]));
                nums.setOperator(numbers[1]);
                nums.setNum2(Integer.parseInt(numbers[2]));
                System.out.println("Результат: " + nums.operation());
            }else if(romanM.find()) {
                NumbersAndOperator nums = new NumbersAndOperator();
                nums.setNum1(conv.romanToArabic(numbers[0]));
                nums.setOperator(numbers[1]);
                nums.setNum2(conv.romanToArabic(numbers[2]));
                System.out.println("Результат: " + conv.ArabicToRoman(nums.operation()));
            }else {
                throw new Exception("Ввод неверен");
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
