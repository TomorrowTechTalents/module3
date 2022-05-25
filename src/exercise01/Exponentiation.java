package exercise01;

class Exponentiation implements Calculo {
    private final double number;

    Exponentiation(double number) {
        this.number = number;
    }

    @Override
    public double evaluate(double number) {
        return Math.pow(this.number, number);
    }
}
