package exercise01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("escolha uma opção:");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - adição");
            System.out.println("4 - divisão");
            System.out.println("5 - sair");
            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("até logo");

                return;
            }

            System.out.print("digite um número: ");
            double number1 = scanner.nextDouble();

            System.out.print("digite o segundo número: ");
            double number2 = scanner.nextDouble();

            double result;

            switch (option) {
                case 1:
                    Calculo sum = new Soma();
                    result = sum.evaluate(number1, number2);
                    break;
                case 2:
                    Calculo subtraction = new Subtração();
                    result = subtraction.evaluate(number1, number2);
                    break;
                case 3:
                    Calculo addition = new Adição();
                    result = addition.evaluate(number1, number2);
                    break;
                case 4:
                    Calculo division = new Divisão();
                    result = division.evaluate(number1, number2);
                    break;
                default:
                    throw new RuntimeException("opção inválida");
            }

            System.out.println(result);
            System.out.println("==========");
        }
    }
}
