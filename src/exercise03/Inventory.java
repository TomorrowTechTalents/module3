package exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Inventory {
    private final List<Product> products = new ArrayList<>();

    void add() {
        System.out.println("Qual a categoria do produto a ser adicionado?");
        System.out.println("1 - livros para todos os públicos");
        System.out.println("2 - livros para público adulto");
        System.out.println("3 - jogos para todos os públicos");
        System.out.println("4 - jogos para público adulto");
        System.out.println("5 - filmes para todos os públicos");
        System.out.println("6 - filmes para público adulto");
        System.out.println("7 - álbuns de música para todos os públicos");
        System.out.println("8 - álbuns de música para público adulto");
        System.out.println("9 - brinquedos para todos os públicos");
        System.out.println("10 - brinquedos para público adulto");
        System.out.println("11 - cancelar");

        Scanner scanner = new Scanner(System.in);

        Product product;

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                product = new Book();
                break;
            case 2:
                product = new BookForAdultAudience();
                break;
            case 3:
                product = new Game();
                break;
            case 4:
                product = new GameForAdultAudience();
                break;
            case 5:
                product = new Movie();
                break;
            case 6:
                product = new MovieForAdultAudience();
                break;
            case 7:
                product = new Album();
                break;
            case 8:
                product = new AlbumForAdultAudience();
                break;
            case 9:
                product = new Toy();
                break;
            case 10:
                product = new ToyForAdultAudience();
                break;
            case 11:
                return;
            default:
                System.err.println("opção inválida");
                return;
        }

        this.add(product);

        System.out.println("\nProduto cadastrado com sucesso!");
    }

    private void add(Product product) {
        this.products.add(product);
    }

    List<Product> getProducts() {
        return this.products;
    }

    private Product getProductById(int id) { // usar stream
        for (Product product : this.products) {
            if (product.getId() == id) {
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
}
