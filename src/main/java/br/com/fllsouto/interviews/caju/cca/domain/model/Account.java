package br.com.fllsouto.interviews.caju.cca.domain.model;

import java.math.BigDecimal;
import java.util.UUID;

import br.com.fllsouto.interviews.caju.cca.domain.type.MerchantType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import static br.com.fllsouto.interviews.caju.cca.domain.type.MerchantType.MEAL;
import static br.com.fllsouto.interviews.caju.cca.domain.type.MerchantType.FOOD;
import static br.com.fllsouto.interviews.caju.cca.domain.type.MerchantType.CASH;

@Entity
public class Account {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;
    private BigDecimal foodBalance;
    private BigDecimal mealBalance;
    private BigDecimal cashBalance;

    public Account(){}

    public Account(BigDecimal foodBalance, BigDecimal mealBalance, BigDecimal cashBalance) {
        this.uuid = UUID.randomUUID();
        this.foodBalance = foodBalance;
        this.mealBalance = mealBalance;
        this.cashBalance = cashBalance;
    }

    public Long getId() {
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

    public UUID getUUID() {
        return uuid;
    }

    // TODO: REMOVE THIS
    public static Account mainAccount() {
        BigDecimal foodBalance = BigDecimal.valueOf(200.00);
        BigDecimal mealBalance = BigDecimal.valueOf(300.00);
        BigDecimal cashBalance = BigDecimal.valueOf(500.00);
        return new Account(foodBalance, mealBalance, cashBalance);
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", uuid=" + uuid + ", foodBalance=" + foodBalance + ", mealBalance=" + mealBalance
                + ", cashBalance=" + cashBalance + "]";
    }

    public Boolean withdraw(MerchantType merchType, BigDecimal totalAmount) {
        boolean result = false;
        System.out.println("BEFORE::::");
        System.out.println(merchType.getType());
        System.out.println(totalAmount);
        System.out.println(this);
        // TODO: Extract repetition
        switch (merchType) {
            case FOOD:
                if (this.foodBalance.compareTo(totalAmount) >= 0) {
                    this.foodBalance = this.foodBalance.subtract(totalAmount);
                    result = true;
                }
                break;
            case MEAL:
                if (this.mealBalance.compareTo(totalAmount) >= 0) {
                    this.mealBalance = this.mealBalance.subtract(totalAmount);
                    result = true;
                }
                break;
            case CASH:
                if (this.cashBalance.compareTo(totalAmount) >= 0) {
                    this.cashBalance = this.cashBalance.subtract(totalAmount);
                    result = true;
                }
                break;
            default:
                break;
        }
        System.out.println("AFTER::::");
        System.out.println(this);
        return result;
    }



    
}
