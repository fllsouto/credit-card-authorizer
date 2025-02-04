package br.com.fllsouto.interviews.caju.cca.api.payload.output;

import java.math.BigDecimal;
import java.util.UUID;

public class AccountOutput {
    private UUID uuid;
    private BigDecimal foodBalance;
    private BigDecimal mealBalance;
    private BigDecimal cashBalance;

    public AccountOutput(UUID uuid, BigDecimal foodBalance, BigDecimal mealBalance, BigDecimal cashBalance) {
        this.uuid = uuid;
        this.foodBalance = foodBalance;
        this.mealBalance = mealBalance;
        this.cashBalance = cashBalance;
    }

    public UUID getUUID() {
        return uuid;
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
