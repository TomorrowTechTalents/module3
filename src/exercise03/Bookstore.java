package exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bookstore { // coisas de livraria
    private Inventory inventory;
    private CashRegister cashRegister;

    void addProduct() { // melhor na main?
        System.out.println("Qual a categoria do produto a ser adicionado?");
        System.out.println("1 - livros");
        System.out.println("2 - jogos");
        System.out.println("3 - filmes");
        System.out.println("4 - álbuns de música");
        System.out.println("5 - brinquedos");
        System.out.println("6 - cancelar");

        Scanner scanner = new Scanner(System.in);

        Product product = null;

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
                // opção cancelar
                break;
            default:
                System.err.println("opção inválida");
        }

        this.inventory.add(product); // ou talvez passar o inventário como parâmetro

        System.out.println("\nProduto cadastrado com sucesso!");
    } // colocar na documentacao que sem nada é mais protegido que protected

    void checkProduct() {
        System.out.print("id do produto: ");

        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        this.inventory.checkProductById(id);
    }

    void updateProduct() {
        System.out.print("id do produto: ");

        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        Product product = this.inventory.findProductById(id);

        product.update();
    }

    void deleteProduct() {
        System.out.print("id do produto: "); // método getProductId()

        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        Product product = this.inventory.findProductById(id);

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

    void executePurchase() { // talvez mover pra cashregister
        Scanner scanner = new Scanner(System.in);

        List<Product> purchaseProducts = new ArrayList<>();

        while (true) {
            System.out.print("id do produto: ");

            String idString = scanner.nextLine();

            if (idString.isEmpty()) {
                break;
            }

            Product product = this.inventory.findProductById(Integer.parseInt(idString));

            purchaseProducts.add(product);
        }

        for (Product product : purchaseProducts) {
            cashRegister.cash = cashRegister.cash.add(product.price);

            this.inventory.delete(product);
        }
    }

}
