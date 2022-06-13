package exercise03;

import java.util.List;
import java.util.Scanner;

import static exercise03.InventoryListPrinter.listAll;
import static exercise03.InventoryListPrinter.listProductsByCategory;
import static exercise03.InventoryNumberOfProductsByCategory.showNumberOfProductsByCategory;

public class Main {
    public static void main(String[] args) {
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

            List<Product> products;
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
                    products = livrariaDoAdemir.getInventory().getProducts();
                    showNumberOfProductsByCategory(products);
                    break;
                case 6:
                    products = livrariaDoAdemir.getInventory().getProducts();
                    listAll(products);
                    break;
                case 7:
                    products = livrariaDoAdemir.getInventory().getProducts();
                    listProductsByCategory(products);
                    break;
                case 8:
                    List<Product> purchaseProducts = livrariaDoAdemir.getInventory().getProductsListById();
                    Purchase purchase = new Purchase(purchaseProducts);
                    DiscountForBuyingBooks discount = new DiscountForBuyingBooks();
                    livrariaDoAdemir.executePurchaseWithRestrictionsAndDiscountRule(purchase, discount);
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
