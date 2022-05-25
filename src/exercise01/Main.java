package exercise01;

import java.util.Scanner;

public class Main {
    private enum Operation {
        SUMMATION("soma"), SUBTRACTION("subtração"), ADDITION("adição"), DIVISION("divisão");

        final String string;

        Operation(String string) {
            this.string = string;
        }

        static int size() {
            return Operation.values().length;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("escolha uma opção:");

            for (Operation operation : Operation.values()) {
                System.out.println(operation.ordinal() + 1 + " - " + operation.string);
            }

            System.out.println(Operation.size() + 1 + " - sair");

            int option = scanner.nextInt();

            if (option == Operation.size() + 1) {
                System.out.println("até logo");

                return;
            }

            if (option <= 0 || option >= Operation.size() + 2) {
                throw new RuntimeException("por favor escolha uma opção válida");
            }

            System.out.print("digite um número: ");
            double number1 = scanner.nextDouble();

            System.out.print("digite o segundo número: ");
            double number2 = scanner.nextDouble();

            Calculo operation;

            Operation optionEnum = Operation.values()[option - 1];

            switch (optionEnum) {
                case SUMMATION:
                    operation = new Soma(number1);
                    break;
                case SUBTRACTION:
                    operation = new Subtração(number1);
                    break;
                case ADDITION:
                    operation = new Adição(number1);
                    break;
                case DIVISION:
                    operation = new Divisão(number1);
                    break;
                default:
                    throw new RuntimeException("um erro ocorreu");
            }

            double result = operation.evaluate(number2);

            //botar leitura dos dados aqui?

            System.out.println(result);
            System.out.println("==========");
        }
    }
}
