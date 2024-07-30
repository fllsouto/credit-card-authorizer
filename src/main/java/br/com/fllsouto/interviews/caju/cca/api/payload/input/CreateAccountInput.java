package br.com.fllsouto.interviews.caju.cca.api.payload.input;

import java.math.BigDecimal;

public class CreateAccountInput {

    private BigDecimal foodBalance;
    private BigDecimal mealBalance;
    private BigDecimal cashBalance;

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
