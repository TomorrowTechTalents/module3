package exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Inventory inventory = new Inventory();

    public static void main(String[] args) { // é como se fosse o front, colocar isso na documentacao

        // new Bookstore?

        while(true) {
            System.out.println("Livraria do Ademir");
            System.out.println("escolha uma opção:");
            System.out.println("1 - adicionar um produto");
            System.out.println("2 - ver dados de um produto");
            System.out.println("3 - alterar dados de um produto");
            System.out.println("4 - remover um produto");
            System.out.println("5 - ver quantos itens de uma categoria existem em estoque");
            System.out.println("6 - listar itens em estoque");
            System.out.println("7 - listar itens de uma categoria");
            System.out.println("8 - operação de compra");
            System.out.println("9 - encerrar");

            Scanner scanner = new Scanner(System.in);

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    checkProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    showNumberOfProductsByCategory();
                    break;
                case 6:
                    listProducts();
                    break;
                case 7:
                    listProductsByCategory();
                    break;
                case 8:
                    executePurchase();
                    break;
                case 9:
                    System.out.println("Até mais!");
                    return;
                default:
                    System.err.println("opção inválida");
            }

            System.out.println("\n==========\n");
        }
    }

    private static void addProduct() { // melhor na main
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

        inventory.add(product); // ou talvez passar o inventário como parâmetro

        System.out.println("\nProduto cadastrado com sucesso!");
    }

    private static void checkProduct() {
        System.out.print("id do produto: ");

        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        inventory.checkProductById(id);
    }

    private static void updateProduct() {
        System.out.print("id do produto: ");

        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        Product product = inventory.findProductById(id);

        product.update();
    }

    private static void deleteProduct() {
        System.out.print("id do produto: ");

        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        Product product = inventory.findProductById(id);

        inventory.delete(product);
    }

    private static void showNumberOfProductsByCategory() {
        System.out.println("Qual a categoria de interesse?");
        System.out.println("1 - livros");
        System.out.println("2 - jogos");
        System.out.println("3 - filmes");
        System.out.println("4 - álbuns de música");
        System.out.println("5 - brinquedos");
        System.out.println("6 - cancelar");

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                for (Product product : inventory.products) {
                    if (product instanceof Book) {
                        counter++;
                    }
                }

                System.out.println("há " + counter + " livro(s) em estoque");

                break;
            case 2:
                for (Product product : inventory.products) {
                    if (product instanceof Game) {
                        counter++;
                    }
                }

                System.out.println("há " + counter + " jogo(s) em estoque");

                break;
            case 3:
                for (Product product : inventory.products) {
                    if (product instanceof Movie) {
                        counter++;
                    }
                }

                System.out.println("há " + counter + " filme(s) em estoque");

                break;
            case 4:
                for (Product product : inventory.products) {
                    if (product instanceof Album) {
                        counter++;
                    }
                }

                System.out.println("há " + counter + " álbum(ns) de música em estoque");

                break;
            case 5:
                for (Product product : inventory.products) {
                    if (product instanceof Toy) {
                        counter++;
                    }
                }

                System.out.println("há " + counter + " brinquedo(s) em estoque");

                break;
            case 6:
                break;
            default:
                System.out.println("opção inválida");
        }
    }

    private static void listProducts() {
        for (Product product : inventory.products) {
            System.out.println(product);
        }
    }

    private static void listProductsByCategory() {
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
                for (Product product : inventory.products) {
                    if (product instanceof Book) {
                        System.out.println(product);
                    }
                }
                break;
            case 2:
                for (Product product : inventory.products) {
                    if (product instanceof Game) {
                        System.out.println(product);
                    }
                }
                break;
            case 3:
                for (Product product : inventory.products) {
                    if (product instanceof Movie) {
                        System.out.println(product);
                    }
                }
                break;
            case 4:
                for (Product product : inventory.products) {
                    if (product instanceof Album) {
                        System.out.println(product);
                    }
                }
                break;
            case 5:
                for (Product product : inventory.products) {
                    if (product instanceof Toy) {
                        System.out.println(product);
                    }
                }
                break;
            case 6:
                break;
            default:
                System.out.println("opção inválida");
        }

    }

    private static void executePurchase() {
        Scanner scanner = new Scanner(System.in);
        CashRegister cashRegister = new CashRegister(); // deveria estar junto a criacao de inventario?

        List<Product> purchaseProducts = new ArrayList<>();

        while (true) {
            System.out.print("id do produto: ");

            String idString = scanner.nextLine();

            if (idString.isEmpty()) {
                break;
            }

            Product product = inventory.findProductById(Integer.parseInt(idString));

            purchaseProducts.add(product);
        }

        for (Product product : purchaseProducts) {
            cashRegister.cash = cashRegister.cash.add(product.price);

            inventory.delete(product);
        }
    }
}
