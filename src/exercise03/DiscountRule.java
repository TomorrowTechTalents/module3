package exercise03;

import java.math.BigDecimal;

@FunctionalInterface
public interface DiscountRule {
    BigDecimal apply(Purchase purchase);
}
