package exercise03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// é como se fosse, faz a vezes de, o front, colocar isso na documentacao

        Inventory inventory = new Inventory();
        CashRegister cashRegister = new CashRegister();
        Bookstore livrariaDoAdemir = new Bookstore(inventory, cashRegister);

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
                    livrariaDoAdemir.getInventory().add();
                    break;
                case 2:
                    Product.check(livrariaDoAdemir.getInventory());
                    break;
                case 3:
                    Product.update(livrariaDoAdemir.getInventory());
                    break;
                case 4:
                    livrariaDoAdemir.getInventory().delete();
                    break;
                case 5:
                    livrariaDoAdemir.getInventory().showNumberOfProductsByCategory();
                    break;
                case 6:
                    livrariaDoAdemir.getInventory().listAll();
                    break;
                case 7:
                    livrariaDoAdemir.getInventory().listProductsByCategory();
                    break;
                case 8:
                    livrariaDoAdemir.executePurchaseWithRestrictions();
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
}
