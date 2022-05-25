package exercise01;

class Multiplication implements Calculo {
    private final double number;

    Multiplication(double number) {
        this.number = number;
    }

    @Override
    public double evaluate(double number) {
        return this.number * number;
    }
}
