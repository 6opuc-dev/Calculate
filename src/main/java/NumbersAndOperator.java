public class NumbersAndOperator {
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    int num1;

    public void setNum2(int num2) {
        this.num2 = num2;
            }

    int num2;

    public void setOperator(String operator) {
        this.operator = operator;
    }

    String operator;

    public int operation () {
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }
}
