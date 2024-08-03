package br.com.fllsouto.interviews.caju.cca.api.payload.form;

import java.math.BigDecimal;

public class CreateAccountForm {

    //TODO: Validate with Bean Validator
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

    @Override
    public String toString() {
        return "CreateAccountForm [foodBalance=" + foodBalance + ", mealBalance=" + mealBalance + ", cashBalance="
                + cashBalance + "]";
    }
}
