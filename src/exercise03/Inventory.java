package exercise03;

import java.util.ArrayList;
import java.util.List;

class Inventory {
    private final List<Product> products = new ArrayList<>();

    void add(Product product) {
        this.products.add(product);
    }

    // talvez fazer privada
    Product findProductById(int id) { // usar stream
        for (Product product : this.products) {
            if (product.id == id) { // garantir que o id é único, static na class, automatico++
                return product;
            }
        }

        System.err.println("id não encontrado");
        return null;
    }

    void checkProductById(int id) {
        Product product = findProductById(id);

        if (product != null) {
            System.out.println(product);
        }
    }

    void delete(Product product) {
        products.remove(product);
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
