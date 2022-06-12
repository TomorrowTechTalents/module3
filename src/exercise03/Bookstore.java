package exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bookstore { // coisas de livraria
    private final Inventory inventory;
    private final CashRegister cashRegister;

    Bookstore(Inventory inventory, CashRegister cashRegister) {
        this.inventory = inventory;
        this.cashRegister = cashRegister;
    }

    void addProduct() {
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

        this.inventory.add(product);

        System.out.println("\nProduto cadastrado com sucesso!");
    } // colocar na documentacao que sem nada é mais protegido que protected

    void checkProduct() {
        Product product = this.inventory.getProductById();

        if (product != null) {
            product.check();
        }
    }

    void updateProduct() {
        Product product = this.inventory.getProductById();

        product.update();
    }

    void deleteProduct() {
        Product product = this.inventory.getProductById();

        this.inventory.delete(product);
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
                System.out.println("há " + this.inventory.getNumberOfBooks() + " livro(s) em estoque");
                break;
            case 2:
                System.out.println("há " + this.inventory.getNumberOfGames() + " jogo(s) em estoque");
                break;
            case 3:
                System.out.println("há " + this.inventory.getNumberOfMovies() + " filme(s) em estoque");
                break;
            case 4:
                System.out.println("há " + this.inventory.getNumberOfAlbums() + " álbum(ns) de música em estoque");
                break;
            case 5:
                System.out.println("há " + this.inventory.getNumberOfToys() + " brinquedo(s) em estoque");
                break;
            case 6:
                break;
            default:
                System.out.println("opção inválida");
        }
    }

    void listProducts() {
        this.inventory.listAll();
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
                this.inventory.listBooks();
                break;
            case 2:
                this.inventory.listGames();
                break;
            case 3:
                this.inventory.listMovies();
                break;
            case 4:
                this.inventory.listAlbums();
                break;
            case 5:
                this.inventory.listToys();
                break;
            case 6:
                break;
            default:
                System.out.println("opção inválida");
        }
    }

    void executePurchase() {
        List<Product> purchaseProducts = this.inventory.getProductsListById();

        this.cashRegister.registerPurchase(purchaseProducts);

        this.inventory.delete(purchaseProducts);
    }
}
