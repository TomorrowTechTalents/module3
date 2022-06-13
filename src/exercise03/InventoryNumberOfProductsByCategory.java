package exercise03;

import java.util.List;
import java.util.Scanner;

class InventoryNumberOfProductsByCategory {
    private InventoryNumberOfProductsByCategory() {}

    private static int getNumberOfBooks(List<Product> products) {
        int numberOfBooks = 0;

        for (Product product : products) {
            if (product instanceof Book) {
                numberOfBooks++;
            }
        }

        return numberOfBooks;
    }

    private static int getNumberOfGames(List<Product> products) {
        int numberOfGames = 0;

        for (Product product : products) {
            if (product instanceof Game) {
                numberOfGames++;
            }
        }

        return numberOfGames;
    }

    private static int getNumberOfMovies(List<Product> products) {
        int numberOfMovies = 0;

        for (Product product : products) {
            if (product instanceof Movie) {
                numberOfMovies++;
            }
        }

        return numberOfMovies;
    }

    private static int getNumberOfAlbums(List<Product> products) {
        int numberOfAlbums = 0;

        for (Product product : products) {
            if (product instanceof Album) {
                numberOfAlbums++;
            }
        }

        return numberOfAlbums;
    }

    private static int getNumberOfToys(List<Product> products) {
        int numberOfToys = 0;

        for (Product product : products) {
            if (product instanceof Toy) {
                numberOfToys++;
            }
        }

        return numberOfToys;
    }

    static void showNumberOfProductsByCategory(List<Product> products) {
        System.out.println("Qual a categoria de interesse?");
        System.out.println("1 - livros");
        System.out.println("2 - jogos");
        System.out.println("3 - filmes");
        System.out.println("4 - álbuns de música");
        System.out.println("5 - brinquedos");
        System.out.println("6 - cancelar");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("há " + getNumberOfBooks(products) + " livro(s) em estoque");
                break;
            case 2:
                System.out.println("há " + getNumberOfGames(products) + " jogo(s) em estoque");
                break;
            case 3:
                System.out.println("há " + getNumberOfMovies(products) + " filme(s) em estoque");
                break;
            case 4:
                System.out.println("há " + getNumberOfAlbums(products) + " álbum(ns) de música em estoque");
                break;
            case 5:
                System.out.println("há " + getNumberOfToys(products) + " brinquedo(s) em estoque");
                break;
            case 6:
                break;
            default:
                System.out.println("opção inválida");
        }
    }
}
