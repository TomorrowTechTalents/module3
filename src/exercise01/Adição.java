package exercise01;

class Adição implements Calculo {
    private final double number;

    Adição(double number) {
        this.number = number;
    }

    @Override
    public double evaluate(double number) {
        return this.number + number;
    }
}
