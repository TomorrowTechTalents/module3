package exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Product {
    private final List<BookGenre> genres = new ArrayList<>();
    private final List<String> authors = new ArrayList<>(); // talvez fazer Set hein
    private String publisher;

    @Override
    public String toString() {
        return "Livro = {nome: " + this.name + ", id: " + this.id + ", preço: " + this.price + ", gêneros: " +
                this.genres + ", escritores: " + this.authors + ", editora: " + this.publisher + "}";
    }

    @Override
    void update() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("novo nome: ");
        this.name = scanner.nextLine();

        System.out.print("novo preço: ");
        this.price = scanner.nextBigDecimal();
        scanner.nextLine();

        this.genres.clear();
        while (true) {
            System.out.print("novo gênero: ");

            String genreString = scanner.nextLine();

            if (genreString.isEmpty()) {
                break;
            }

            this.genres.add(BookGenre.valueOf(genreString));
        }

        this.authors.clear();
        while (true) {
            System.out.print("novo escritor: ");

            String author = scanner.nextLine();

            if (author.isEmpty()) {
                break;
            }

            this.authors.add(author);
        }

        System.out.print("nova editora: ");
        this.publisher = scanner.nextLine();

    }

    Book() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("gênero: ");

            String genreString = scanner.nextLine();

            if (genreString.isEmpty()) {
                break;
            }

            this.genres.add(BookGenre.valueOf(genreString));
        }

        while (true) {
            System.out.print("escritor: ");

            String author = scanner.nextLine();

            if (author.isEmpty()) {
                break;
            }

            this.authors.add(author);
        }

        System.out.print("editora: ");
        this.publisher = scanner.nextLine();
    }
}
