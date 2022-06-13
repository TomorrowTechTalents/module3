package exercise03;

import java.util.List;

class Bookstore {
    private final Inventory inventory;
    private final CashRegister cashRegister;

    Bookstore(Inventory inventory, CashRegister cashRegister) {
        this.inventory = inventory;
        this.cashRegister = cashRegister;
    }

    void executePurchase(Purchase purchase) {
        List<Product> purchaseProducts = this.inventory.getProductsListById();

        this.cashRegister.registerPurchase(purchase);

        this.inventory.delete(purchaseProducts);
    }

    private void executePurchaseWithRestrictions(Purchase purchase) {
        if (purchase.getRestricted()) {
            purchase.setBuyer(Buyer.getBuyerInstance()); //fazer isso na Purchase validator?

            if (purchase.getBuyer().getMinor()) {
                System.out.println("compra bloqueada");

                return;
            }
        }

        this.cashRegister.registerPurchase(purchase); //

        this.inventory.delete(purchase.getPurchaseProducts());
    }

    void executePurchaseWithRestrictionsAndDiscountRule(Purchase purchase, DiscountRule discountRule) {
        discountRule.apply(purchase);

        executePurchaseWithRestrictions(purchase);
    }

    Inventory getInventory() {
        return this.inventory;
    }
}
