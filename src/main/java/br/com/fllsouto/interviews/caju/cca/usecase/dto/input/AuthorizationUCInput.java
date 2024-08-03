package br.com.fllsouto.interviews.caju.cca.usecase.dto.input;

import java.math.BigDecimal;
import java.util.UUID;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.TransactionForm;

public class AuthorizationUCInput {
    private UUID transactionUUID;
    private UUID accountUUID;
    private BigDecimal totalAmount;
    private String mcc;
    private String merchant;

    private AuthorizationUCInput(UUID transactionUUID, UUID accountUUID, BigDecimal totalAmount, String mcc, String merchant) {
        this.transactionUUID = transactionUUID;
        this.accountUUID = accountUUID;
        this.totalAmount = totalAmount;
        this.mcc = mcc;
        this.merchant = merchant;
    }

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

    public static AuthorizationUCInput buildFrom(TransactionForm form) {
        return new AuthorizationUCInput(
            form.getTransactionUUID(),
            form.getAccountUUID(),
            form.getTotalAmount(),
            form.getMcc(),
            form.getMerchant()
        );
    }
}