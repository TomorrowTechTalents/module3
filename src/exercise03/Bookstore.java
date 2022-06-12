package exercise03;

import java.util.List;

class Bookstore { // coisas de livraria
    private final Inventory inventory;
    private final CashRegister cashRegister;

    Bookstore(Inventory inventory, CashRegister cashRegister) {
        this.inventory = inventory;
        this.cashRegister = cashRegister;
    }



    void executePurchase() {
        List<Product> purchaseProducts = this.inventory.getProductsListById();

        this.cashRegister.registerPurchase(purchaseProducts);

        this.inventory.delete(purchaseProducts);
    }

    Inventory getInventory() {
        return this.inventory;
    }
}
