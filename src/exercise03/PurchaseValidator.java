package exercise03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

class PurchaseValidator {
    private static final int LEGAL_AGE = 18;
    private PurchaseValidator() {}

    static boolean isPurchaseRestricted(List<Product> purchaseProducts) {
        for (Product product : purchaseProducts) {
            if (product instanceof ProductForAdultAudience) {
                return true;
            }
        }

        return false;
    }

    static boolean isBuyerAMinor(Buyer buyer) {
        return LocalDate.from(buyer.getBirthday()).until(LocalDate.now(), ChronoUnit.YEARS) < LEGAL_AGE;
    }
}
