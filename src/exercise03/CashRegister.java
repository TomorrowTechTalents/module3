package exercise03;

import java.math.BigDecimal;

class CashRegister {
    private BigDecimal cash = BigDecimal.ZERO;

    void registerPurchase(Purchase purchase) {
        BigDecimal salesValue = purchase.getValue();

        this.cash = this.cash.add(salesValue);

        System.out.println("Venda concluída com sucesso! O novo saldo em caixa é de R$ " + this.cash);
    }
}
