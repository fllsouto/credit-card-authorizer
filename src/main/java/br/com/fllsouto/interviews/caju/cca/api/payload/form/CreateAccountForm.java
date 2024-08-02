package br.com.fllsouto.interviews.caju.cca.api.payload.form;

import java.math.BigDecimal;

public class CreateAccountForm {

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
