package exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie extends Product {
    private String studio;
    private final List<String> directors = new ArrayList<>();
    private final List<MovieGenre> genres = new ArrayList<>();
    private final List<String> producers = new ArrayList<>();

    @Override
    public String toString() {
        return "Filme = {nome: " + this.name + ", id: " + this.id + ", preço: " + this.price +
                         ", estúdio: " + this.studio + ", diretores: " + this.directors +
                         ", gêneros: " + this.genres + ", produtores: " + this.producers + "}";
    }

    @Override
    void update() {
        super.update();

        Scanner scanner = new Scanner(System.in);

        System.out.print("novo estúdio: ");
        this.studio = scanner.nextLine();

        directors.clear();
        while (true) {
            System.out.print("novo diretor: ");

            String director = scanner.nextLine();

            if (director.isEmpty()) {
                break;
            }

            directors.add(director);
        }

        genres.clear();
        while (true) {
            System.out.print("novo gênero: ");

            String genreString = scanner.nextLine().toUpperCase();

            if (genreString.isEmpty()) {
                break;
            }

            genres.add(MovieGenre.valueOf(genreString));
        }

        producers.clear();
        while (true) {
            System.out.print("novo produtor: ");

            String producer = scanner.nextLine();

            if (producer.isEmpty()) {
                break;
            }

            producers.add(producer);
        }
    }

    Movie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("estúdio: ");
        this.studio = scanner.nextLine();

        while (true) {
            System.out.print("diretor: ");

            String director = scanner.nextLine();

            if (director.isEmpty()) {
                break;
            }

            directors.add(director);
        }

        while (true) {
            System.out.print("gênero: ");

            String genreString = scanner.nextLine().toUpperCase();

            if (genreString.isEmpty()) {
                break;
            }

            genres.add(MovieGenre.valueOf(genreString));
        }

        while (true) {
            System.out.print("produtor: ");

            String producer = scanner.nextLine();

            if (producer.isEmpty()) {
                break;
            }

            producers.add(producer);
        }
    }
}
