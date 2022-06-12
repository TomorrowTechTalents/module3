package exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Album extends Product {
    private final List<String> artists = new ArrayList<>();
    private final List<MusicGenre> genres = new ArrayList<>();
    private final List<String> labels = new ArrayList<>();

    @Override
    public String toString() {
        return "Filme = {nome: " + this.name + ", id: " + this.id + ", preço: " + this.price +
                         ", músicos/bandas: " + this.artists + ", gêneros: " + this.genres +
                         ", selos: " + this.labels + "}";
    }

    @Override
    void update() {
        super.update();

        Scanner scanner = new Scanner(System.in);

        artists.clear();
        while (true) {
            System.out.print("novo músico/banda: ");

            String artist = scanner.nextLine();

            if (artist.isEmpty()) {
                break;
            }

            artists.add(artist);
        }

        genres.clear();
        while (true) {
            System.out.print("novo gênero: ");

            String genreString = scanner.nextLine().toUpperCase();

            if (genreString.isEmpty()) {
                break;
            }

            genres.add(MusicGenre.valueOf(genreString));
        }

        labels.clear();
        while (true) {
            System.out.print("novo selo: ");

            String label = scanner.nextLine();

            if (label.isEmpty()) {
                break;
            }

            labels.add(label);
        }
    }

    Album() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("músico/banda: ");

            String artist = scanner.nextLine();

            if (artist.isEmpty()) {
                break;
            }

            artists.add(artist);
        }

        while (true) {
            System.out.print("gênero: ");

            String genreString = scanner.nextLine().toUpperCase();

            if (genreString.isEmpty()) {
                break;
            }

            genres.add(MusicGenre.valueOf(genreString));
        }

        while (true) {
            System.out.print("selo: ");

            String label = scanner.nextLine();

            if (label.isEmpty()) {
                break;
            }

            labels.add(label);
        }
    }
}
