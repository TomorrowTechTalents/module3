package exercise03;

import java.util.List;

class Bookstore {
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

    void executePurchaseWithRestrictions() {
        List<Product> purchaseProducts = this.inventory.getProductsListById();

        boolean purchaseRestricted = PurchaseValidator.isPurchaseRestricted(purchaseProducts);

        if (purchaseRestricted) {
            Buyer buyer = Buyer.getBuyerInstance();

            if (PurchaseValidator.isBuyerAMinor(buyer)) {
                System.out.println("compra bloqueada");

                return;
            }
        }

        this.cashRegister.registerPurchase(purchaseProducts);

        this.inventory.delete(purchaseProducts);
    }

    Inventory getInventory() {
        return this.inventory;
    }
}
