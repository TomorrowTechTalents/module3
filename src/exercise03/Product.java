package exercise03;

import java.math.BigDecimal;
import java.util.Scanner;

abstract class Product {
    private String name;
    private final int id;
    private BigDecimal price;
    private static int idCounter = 0;

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    BigDecimal getPrice() {
        return price;
    }

    @Override
    public abstract String toString();

    private void check() {
        System.out.println(this);
    }

    static void check(Inventory inventory) {
        Product product = inventory.getProductById();

        if (product != null) {
            product.check();
        }
    }

    static void update(Inventory inventory) {
        Product product = inventory.getProductById();

        product.update();
    }

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
        this.price = scanner.nextBigDecimal();
    }
}
