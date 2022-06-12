package exercise03;

import java.math.BigDecimal;
import java.util.List;

class CashRegister {
    private BigDecimal cash = BigDecimal.ZERO;

    void registerPurchase(List<Product> purchaseProducts) {
        BigDecimal salesValue = getSalesValue(purchaseProducts);

        this.cash = this.cash.add(salesValue);
    }

    private BigDecimal getSalesValue(List<Product> purchaseProducts) {
        BigDecimal salesValue = BigDecimal.ZERO;

        for (Product product : purchaseProducts) {
            salesValue = salesValue.add(product.getPrice());
        }

        return salesValue;
    }
}
