package br.com.fllsouto.interviews.caju.cca.usecase.dto.input;

import java.math.BigDecimal;
import java.util.UUID;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.TransactionForm;

public class AuthorizationUCInput {
    private UUID id;
    private UUID accountId;
    private BigDecimal totalAmount;
    private String mcc;
    private String merchant;

    private AuthorizationUCInput(UUID id, UUID accountId, BigDecimal totalAmount, String mcc, String merchant) {
        this.id = id;
        this.accountId = accountId;
        this.totalAmount = totalAmount;
        this.mcc = mcc;
        this.merchant = merchant;
    }

    public UUID getId() {
        return id;
    }
    
    public UUID getAccountId() {
        return accountId;
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
            form.getId(),
            form.getAccountId(),
            form.getTotalAmount(),
            form.getMcc(),
            form.getMerchant()
        );
    }
}