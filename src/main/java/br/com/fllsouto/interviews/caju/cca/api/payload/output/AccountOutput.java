package br.com.fllsouto.interviews.caju.cca.api.payload.output;

import java.math.BigDecimal;
import java.util.UUID;

public class AccountOutput {
    private UUID id;
    private BigDecimal foodBalance;
    private BigDecimal mealBalance;
    private BigDecimal cashBalance;

    public AccountOutput(UUID uuid, BigDecimal foodBalance, BigDecimal mealBalance, BigDecimal cashBalance) {
        this.id = uuid;
        this.foodBalance = foodBalance;
        this.mealBalance = mealBalance;
        this.cashBalance = cashBalance;
    }

    public UUID getId() {
        return id;
    }

    public BigDecimal getFoodBalance() {
        return foodBalance;
    }

    public BigDecimal getMealBalance() {
        return mealBalance;
    }

    public BigDecimal getCashBalance() {
        return cashBalance;
    }
}
