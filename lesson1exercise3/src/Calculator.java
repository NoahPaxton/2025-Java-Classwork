public class Calculator {
    private int number1;
    private int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int addition() {
        return number1 + number2;
    }

    public int subtract() {
        return number1 - number2;
    }

    public int multiply() {
        return number1 * number2;
    }

    public int divide() {
        return number1 / number2;
    }


}