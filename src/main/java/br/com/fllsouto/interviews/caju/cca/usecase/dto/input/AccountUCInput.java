package br.com.fllsouto.interviews.caju.cca.usecase.dto.input;

import java.math.BigDecimal;
import java.util.UUID;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.CreateAccountForm;

public class AccountUCInput {
    private UUID uuid;
    private BigDecimal foodBalance;
    private BigDecimal mealBalance;
    private BigDecimal cashBalance;

    public AccountUCInput() {}

    public AccountUCInput(UUID uuid) {
        this.uuid = uuid;
    }

    public AccountUCInput(CreateAccountForm form) {
        this.foodBalance = form.getFoodBalance();
        this.mealBalance = form.getMealBalance();
        this.cashBalance = form.getFoodBalance();
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
