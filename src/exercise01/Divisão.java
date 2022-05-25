package exercise01;

class Divisão implements Calculo {
    private final double number;

    Divisão(double number) {
        this.number = number;
    }

    @Override
    public double evaluate(double number) {
        return this.number / number;
    }
}
