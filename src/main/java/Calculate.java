import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        try {
            String[] numbers = str.toUpperCase().split(" ");
            if (m.find()) {
                System.out.println("Результат: " + Operations.operation(Integer.parseInt(numbers[0]), numbers[1], Integer.parseInt(numbers[2])));
            } else if (romanM.find()) {
                System.out.println("Результат: " + Converter2.convert(Operations.operation(Converter2.convert(numbers[0]), numbers[1], Converter2.convert(numbers[2]))));
            } else {
                throw new Exception("Ввод неверен");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}