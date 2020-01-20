

public class Calculator {

    public int calculate(Integer num1, Integer num2) {

        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Parametr nie może być nullem!");
        }

        return num1 + num2;
    }

    public int substract(Integer num1, Integer num2) {

        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Parametr nie może być nullem!");
        }

        return num1 - num2;
    }

    public int multiply(Integer num1, Integer num2) {

        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Parametr nie może być nullem!");
        }

        return num1 * num2;
    }

    public int divide(Integer num1, Integer num2) {

        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Parametr nie może być nullem!");
        }

        if (num2 == 0) {
            throw new IllegalArgumentException("Dzielnik nie może być zerem");
        }

        return num1 / num2;
    }




}
