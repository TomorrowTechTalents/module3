package exercise03;

import java.math.BigDecimal;
import java.util.Scanner;

abstract class Product {
    String name;
    int id; //ver se funciona
    BigDecimal price;
    private static int idCounter = 0;

    @Override
    public abstract String toString();

    void update() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("novo nome: ");
        this.name = scanner.nextLine();

        System.out.print("novo preço: ");
        this.price = scanner.nextBigDecimal();
    }

    Product() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nome: ");
        this.name = scanner.nextLine();

        this.id = idCounter;
        idCounter++;

        System.out.print("preço: ");
        this.price = scanner.nextBigDecimal(); // precisa do nextline aqui? acho que nao
    }
}
