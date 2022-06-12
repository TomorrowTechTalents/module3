package exercise03;

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
                    listCategory();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
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

    private static void listCategory() {
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
    }
}
