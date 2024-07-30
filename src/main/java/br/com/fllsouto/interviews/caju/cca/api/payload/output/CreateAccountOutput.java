package br.com.fllsouto.interviews.caju.cca.api.payload.output;

import java.math.BigDecimal;
import java.util.UUID;

public class CreateAccountOutput {
    private UUID id;
    private BigDecimal foodBalance;
    private BigDecimal mealBalance;
    private BigDecimal cashBalance;

    
    public CreateAccountOutput(UUID id, BigDecimal foodBalance, BigDecimal mealBalance, BigDecimal cashBalance) {
        this.id = id;
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
    @Override
    public String toString() {
        return "CreateAccountOutput [id=" + id + ", foodBalance=" + foodBalance + ", mealBalance=" + mealBalance
                + ", cashBalance=" + cashBalance + "]";
    }

}
