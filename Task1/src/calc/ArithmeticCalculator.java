package calc;

public class ArithmeticCalculator {
    private int number1;
    private int number2;

    private String operator;

    public ArithmeticCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void calculate(Operation operation){
        if (operation == Operation.ADD){
            System.out.println(number1 + number2);
        } else if (operation == Operation.SUBTRACT) {
            System.out.println(number1 - number2);
        } else if (operation == Operation.MULTIPLY) {
            System.out.println(number1 * number2);
        } else {
            System.out.println("Неверный оператор");
        }
    }
}
