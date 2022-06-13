package exercise03;

import java.math.BigDecimal;

public class DiscountForBuyingBooks implements DiscountRule { // colocar na doc que poderiam ser outras regras
    @Override
    public BigDecimal apply(Purchase purchase) {
        BigDecimal bookSalesValue = BigDecimal.ZERO;

        for (Product product : purchase.getPurchaseProducts()) {
            if (product instanceof Book) {
                bookSalesValue = bookSalesValue.add(product.getPrice());
            }
        }

        if (bookSalesValue.compareTo(BigDecimal.valueOf(200)) > 0) {
            return purchase.getValue().multiply(BigDecimal.valueOf(0.85));
        }

        return  purchase.getValue();
    }
}
