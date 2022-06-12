package exercise03;

import java.util.Scanner;

public class Toy extends Product {
    private String type;

    @Override
    public String toString() {
        return "Filme = {nome: " + this.name + ", id: " + this.id + ", preço: " + this.price +
                         ", tipo: " + this.type + "}";
    }

    @Override
    void update() {
        super.update();

        Scanner scanner = new Scanner(System.in);

        System.out.print("novo tipo: ");
        this.type = scanner.nextLine();
    }

    Toy() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("tipo: ");
        this.type = scanner.nextLine();
    }
}
