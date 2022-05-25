package exercise01;

class Soma implements Calculo {
    private final double number;

    Soma(double number) {
        this.number = number;
    }

    @Override
    public double evaluate(double number) {
        return this.number + number;
    }
}
