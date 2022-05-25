package exercise01;

class Subtração implements Calculo {
    private final double number;

    Subtração(double number) {
        this.number = number;
    }

    @Override
    public double evaluate(double number) {
        return this.number - number;
    }
}
