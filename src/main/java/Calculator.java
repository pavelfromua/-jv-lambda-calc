import java.util.function.BinaryOperator;

public class Calculator {
    public double calculate(double value1, double value2, char operation) {
        BinaryOperator<Double> operator = operation == '+' ? (v1, v2) -> v1 + v2
                : operation == '*' ? (v1, v2) -> v1 * v2
                : operation == '/' ? (v1, v2) -> v1 / v2
                : operation == '-' ? (v1, v2) -> v1 - v2
                : (v1, v2) -> pow(v1, v2);

        return operator.apply(value1, value2);
    }

    private double pow(double value1, double value2) {
        double result = value2 == 0 ? 1 : value1;

        for (int i = 2; i <= value2; i++) {
            result *= value1;
        }

        return result;
    }
}
