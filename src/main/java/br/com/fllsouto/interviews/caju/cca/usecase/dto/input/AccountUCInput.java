package br.com.fllsouto.interviews.caju.cca.usecase.dto.input;

import java.math.BigDecimal;
import java.util.UUID;

public class AccountUCInput {
    private UUID uuid;
    private BigDecimal foodBalance;
    private BigDecimal mealBalance;
    private BigDecimal cashBalance;

    public AccountUCInput(UUID uuid, BigDecimal foodBalance, BigDecimal mealBalance, BigDecimal cashBalance) {
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
