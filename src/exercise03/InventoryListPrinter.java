package exercise03;

import java.util.List;
import java.util.Scanner;

class InventoryListPrinter {
    private InventoryListPrinter() {}

    static void listAll(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    static void listProductsByCategory(List<Product> products) {
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
                listBooks(products);
                break;
            case 2:
                listGames(products);
                break;
            case 3:
                listMovies(products);
                break;
            case 4:
                listAlbums(products);
                break;
            case 5:
                listToys(products);
                break;
            case 6:
                break;
            default:
                System.out.println("opção inválida");
        }
    }

    private static void listBooks(List<Product> products) {
        for (Product product : products) {
            if (product instanceof Book) {
                System.out.println(product);
            }
        }
    }

    private static void listGames(List<Product> products) {
        for (Product product : products) {
            if (product instanceof Game) {
                System.out.println(product);
            }
        }
    }

    private static void listMovies(List<Product> products) {
        for (Product product : products) {
            if (product instanceof Movie) {
                System.out.println(product);
            }
        }
    }

    private static void listAlbums(List<Product> products) {
        for (Product product : products) {
            if (product instanceof Album) {
                System.out.println(product);
            }
        }
    }

    private static void listToys(List<Product> products) {
        for (Product product : products) {
            if (product instanceof Toy) {
                System.out.println(product);
            }
        }
    }
}
