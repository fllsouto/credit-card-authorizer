package br.com.fllsouto.interviews.caju.cca.api.payload.form;

import java.math.BigDecimal;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonAlias;

public class TransactionForm {
    
    //TODO: Validate with Bean Validator
    @JsonAlias("id")
    private UUID transactionUUID;
    @JsonAlias("accountId")
    private UUID accountUUID;
    private BigDecimal totalAmount;
    private String mcc;
    private String merchant;

    public UUID getTransactionUUID() {
        return transactionUUID;
    }
    
    public UUID getAccountUUID() {
        return accountUUID;
    }
    
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }
    
    public String getMcc() {
        return mcc;
    }
    
    public String getMerchant() {
        return merchant;
    }

    @Override
    public String toString() {
        return "TransactionForm [transactionUUID=" + transactionUUID + ", accountUUID=" + accountUUID + ", totalAmount="
                + totalAmount + ", mcc=" + mcc + ", merchant=" + merchant + "]";
    }
}
