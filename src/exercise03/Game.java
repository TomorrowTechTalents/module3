package exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game extends Product {
    private String distributor;
    private final List<GameGenre> genres = new ArrayList<>();
    private String studio;

    @Override
    public String toString() {
        return "Jogo = {nome: " + this.name + ", id: " + this.id + ", preço: " + this.price + ", distribuidora: " +
                this.distributor + ", gêneros: " + this.genres + ", estúdio: " + this.studio + "}";
    }

    @Override
    void update() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("novo nome: ");
        this.name = scanner.nextLine();

        System.out.print("novo preço: ");
        this.price = scanner.nextBigDecimal();
        scanner.nextLine();

        System.out.print("nova distribuidora: ");
        this.distributor = scanner.nextLine();

        this.genres.clear();
        while (true) {
            System.out.print("novo gênero: ");

            String genreString = scanner.nextLine();

            if (genreString.isEmpty()) {
                break;
            }

            this.genres.add(GameGenre.valueOf(genreString));
        }

        System.out.print("novo estúdio: ");
        this.studio = scanner.nextLine();
    }

    Game() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("distribuidora: ");
        this.distributor = scanner.nextLine();

        while (true) {
            System.out.print("gênero: ");

            String genreString = scanner.nextLine();

            if (genreString.isEmpty()) {
                break;
            }

            genres.add(GameGenre.valueOf(genreString));
        }

        System.out.print("estúdio: ");
        this.studio = scanner.nextLine();
    }
}
