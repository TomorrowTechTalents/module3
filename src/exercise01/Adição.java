package exercise01;

public class Adição implements Calculo {
    @Override
    public double evaluate(double number1, double number2) {
        return number1 + number2;
    }
}
