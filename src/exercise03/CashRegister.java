package exercise03;

import java.math.BigDecimal;
import java.util.List;

class CashRegister {
    private BigDecimal cash = BigDecimal.ZERO;

    void registerPurchase(List<Product> purchaseProducts) {
        for (Product product : purchaseProducts) {
            this.cash = this.cash.add(product.price);
        }
    }
}
