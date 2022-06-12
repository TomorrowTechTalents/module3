package exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Inventory {
    private final List<Product> products = new ArrayList<>();

    void add() {
        System.out.println("Qual a categoria do produto a ser adicionado?");
        System.out.println("1 - livros");
        System.out.println("2 - jogos");
        System.out.println("3 - filmes");
        System.out.println("4 - álbuns de música");
        System.out.println("5 - brinquedos");
        System.out.println("6 - cancelar");

        Scanner scanner = new Scanner(System.in);

        Product product;

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                product = new Book();
                break;
            case 2:
                product = new Game();
                break;
            case 3:
                product = new Movie();
                break;
            case 4:
                product = new Album();
                break;
            case 5:
                product = new Toy();
                break;
            case 6:
                return;
            default:
                System.err.println("opção inválida");
                return;
        }

        this.add(product);

        System.out.println("\nProduto cadastrado com sucesso!");
    } // colocar na documentacao que sem nada é mais protegido que protected

    private void add(Product product) {
        this.products.add(product);
    }

    private Product getProductById(int id) { // usar stream
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

        return this.getProductById(id);
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

            Product product = this.getProductById(Integer.parseInt(idString));

            productsList.add(product);
        }

        return productsList;
    }

    void delete() {
        Product product = this.getProductById();

        this.delete(product);
    }

    private void delete(Product product) {
        products.remove(product);
    }
    void delete(List<Product> products) {
        for (Product product : products) {
            this.delete(product);
        }
    }

    private int getNumberOfBooks() {
        int numberOfBooks = 0;

        for (Product product : this.products) {
            if (product instanceof Book) {
                numberOfBooks++;
            }
        }

        return numberOfBooks;
    }

    private int getNumberOfGames() {
        int numberOfGames = 0;

        for (Product product : this.products) {
            if (product instanceof Game) {
                numberOfGames++;
            }
        }

        return numberOfGames;
    }

    private int getNumberOfMovies() {
        int numberOfMovies = 0;

        for (Product product : this.products) {
            if (product instanceof Movie) {
                numberOfMovies++;
            }
        }

        return numberOfMovies;
    }

    private int getNumberOfAlbums() {
        int numberOfAlbums = 0;

        for (Product product : this.products) {
            if (product instanceof Album) {
                numberOfAlbums++;
            }
        }

        return numberOfAlbums;
    }

    private int getNumberOfToys() {
        int numberOfToys = 0;

        for (Product product : this.products) {
            if (product instanceof Toy) {
                numberOfToys++;
            }
        }

        return numberOfToys;
    }

    void showNumberOfProductsByCategory() {
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
                System.out.println("há " + this.getNumberOfBooks() + " livro(s) em estoque");
                break;
            case 2:
                System.out.println("há " + this.getNumberOfGames() + " jogo(s) em estoque");
                break;
            case 3:
                System.out.println("há " + this.getNumberOfMovies() + " filme(s) em estoque");
                break;
            case 4:
                System.out.println("há " + this.getNumberOfAlbums() + " álbum(ns) de música em estoque");
                break;
            case 5:
                System.out.println("há " + this.getNumberOfToys() + " brinquedo(s) em estoque");
                break;
            case 6:
                break;
            default:
                System.out.println("opção inválida");
        }
    }

    void listAll() {
        for (Product product : this.products) {
            System.out.println(product);
        }
    }

    void listProductsByCategory() {
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
                this.listBooks();
                break;
            case 2:
                this.listGames();
                break;
            case 3:
                this.listMovies();
                break;
            case 4:
                this.listAlbums();
                break;
            case 5:
                this.listToys();
                break;
            case 6:
                break;
            default:
                System.out.println("opção inválida");
        }
    }

    private void listBooks() {
        for (Product product : this.products) {
            if (product instanceof Book) {
                System.out.println(product);
            }
        }
    }

    private void listGames() {
        for (Product product : this.products) {
            if (product instanceof Game) {
                System.out.println(product);
            }
        }
    }

    private void listMovies() {
        for (Product product : this.products) {
            if (product instanceof Movie) {
                System.out.println(product);
            }
        }
    }

    private void listAlbums() {
        for (Product product : this.products) {
            if (product instanceof Album) {
                System.out.println(product);
            }
        }
    }

    private void listToys() {
        for (Product product : this.products) {
            if (product instanceof Toy) {
                System.out.println(product);
            }
        }
    }
}
