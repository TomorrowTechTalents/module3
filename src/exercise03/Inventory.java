package exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Inventory {
    private final List<Product> products = new ArrayList<>();

    void add(Product product) {
        this.products.add(product);
    }

    private Product findProductById(int id) { // usar stream
        for (Product product : this.products) {
            if (product.id == id) {
                return product;
            }
        }

        System.err.println("id não encontrado");
        return null;
    }

    Product getProductById() {
        System.out.print("id do produto: ");

        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        return this.findProductById(id);
    }

    List<Product> getProductsListById() {
        Scanner scanner = new Scanner(System.in);

        List<Product> productsList = new ArrayList<>();

        while (true) {
            System.out.print("id do produto: ");

            String idString = scanner.nextLine();

            if (idString.isEmpty()) {
                break;
            }

            Product product = this.findProductById(Integer.parseInt(idString));

            productsList.add(product);
        }

        return productsList;
    }

    void delete(Product product) {
        products.remove(product);
    }

    void delete(List<Product> products) {
        for (Product product : products) {
            this.delete(product);
        }
    }

    int getNumberOfBooks() {
        int numberOfBooks = 0;

        for (Product product : this.products) {
            if (product instanceof Book) {
                numberOfBooks++;
            }
        }

        return numberOfBooks;
    }

    int getNumberOfGames() {
        int numberOfGames = 0;

        for (Product product : this.products) {
            if (product instanceof Game) {
                numberOfGames++;
            }
        }

        return numberOfGames;
    }

    int getNumberOfMovies() {
        int numberOfMovies = 0;

        for (Product product : this.products) {
            if (product instanceof Movie) {
                numberOfMovies++;
            }
        }

        return numberOfMovies;
    }

    int getNumberOfAlbums() {
        int numberOfAlbums = 0;

        for (Product product : this.products) {
            if (product instanceof Album) {
                numberOfAlbums++;
            }
        }

        return numberOfAlbums;
    }

    int getNumberOfToys() {
        int numberOfToys = 0;

        for (Product product : this.products) {
            if (product instanceof Toy) {
                numberOfToys++;
            }
        }

        return numberOfToys;
    }

    void listAll() {
        for (Product product : this.products) {
            System.out.println(product);
        }
    }

    void listBooks() {
        for (Product product : this.products) {
            if (product instanceof Book) {
                System.out.println(product);
            }
        }
    }

    void listGames() {
        for (Product product : this.products) {
            if (product instanceof Game) {
                System.out.println(product);
            }
        }
    }

    void listMovies() {
        for (Product product : this.products) {
            if (product instanceof Movie) {
                System.out.println(product);
            }
        }
    }

    void listAlbums() {
        for (Product product : this.products) {
            if (product instanceof Album) {
                System.out.println(product);
            }
        }
    }

    void listToys() {
        for (Product product : this.products) {
            if (product instanceof Toy) {
                System.out.println(product);
            }
        }
    }
}
