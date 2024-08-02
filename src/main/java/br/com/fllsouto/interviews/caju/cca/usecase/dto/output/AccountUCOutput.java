package br.com.fllsouto.interviews.caju.cca.usecase.dto.output;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.List;
import java.util.Optional;

import br.com.fllsouto.interviews.caju.cca.domain.model.Account;

public class AccountUCOutput {
    private UUID uuid;
    private BigDecimal foodBalance;
    private BigDecimal mealBalance;
    private BigDecimal cashBalance;
    Optional<Account> optAcc;
    List<Account> accs;

    public AccountUCOutput(UUID uuid, BigDecimal foodBalance, BigDecimal mealBalance, BigDecimal cashBalance) {
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

    public void update(Account acc) {
        this.uuid = acc.getUUID();
        this.foodBalance = acc.getFoodBalance();
        this.mealBalance = acc.getMealBalance();
        this.cashBalance = acc.getCashBalance();
    }

    public Account getAcc() {
        return optAcc.get();
    }

    public List<Account> getAccs() {
        return this.accs;
    }

    public void setAcc(Optional<Account> optAcc) {
        this.optAcc = optAcc;
    }

    public void setAcc(List<Account> accs) {
        this.accs = accs;
    }
}
