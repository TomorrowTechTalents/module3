package exercise03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Purchase {
    private Buyer buyer;
    private List<Product> purchaseProducts = new ArrayList<>();
    private final boolean restricted;
    private BigDecimal value;

    Purchase(List<Product> purchaseProducts) {
        this.purchaseProducts = purchaseProducts;
        this.restricted = isPurchaseRestricted();
        this.value = applyDiscountRules(); // é, acho que nao precisava
    }

    private boolean isPurchaseRestricted() {
        for (Product product : this.purchaseProducts) {
            if (product instanceof ProductForAdultAudience) {
                return true;
            }
        }

        return false;
    }

    private BigDecimal getPurchaseValueWithoutDiscount() {
        BigDecimal purchaseValue = BigDecimal.ZERO;

        for (Product product : this.purchaseProducts) {
            purchaseValue = purchaseValue.add(product.getPrice());
        }

        return purchaseValue;
    }

    private BigDecimal applyDiscountRules() {
        this.value = getPurchaseValueWithoutDiscount();

        DiscountForBuyingBooks discount = new DiscountForBuyingBooks();

        return discount.apply(this);
    }

    List<Product> getPurchaseProducts() {
        return this.purchaseProducts;
    }

    boolean getRestricted() {
        return this.restricted;
    }

    BigDecimal getValue() {
        return this.value;
    }

    Buyer getBuyer() {
        if (this.buyer == null) {
            System.err.println("comprador não cadastrado");

            return null;
        }

        return this.buyer;
    }

    void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
}
