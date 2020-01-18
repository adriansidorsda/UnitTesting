public class Calculator {

    public int calculate(int a, int b) {
        return a+b;
    }

    public double calculateIncome(int grossIncome, int tax) {
        double nettoIncome = grossIncome - grossIncome * tax/100;

        return nettoIncome;
    }
}
