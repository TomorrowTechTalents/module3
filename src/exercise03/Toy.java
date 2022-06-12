package exercise03;

import java.util.Scanner;

public class Toy extends Product {
    private String type;

    @Override
    public String toString() {
        return "Filme = {nome: " + this.getName() + ", id: " + this.getId() + ", preço: " + this.getPrice() +
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
