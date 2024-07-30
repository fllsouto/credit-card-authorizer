package br.com.fllsouto.interviews.caju.cca.api.payload.input;

import java.math.BigDecimal;
import java.util.UUID;

public class TransactionInput {
    
    private UUID id;
    private UUID accountId;
    private BigDecimal totalAmount;
    private String mcc;
    private String merchant;

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

    @Override
    public String toString() {
        return "TransactionInput [id=" + id + ", accountId=" + accountId + ", totalAmount=" + totalAmount + ", mcc="
                + mcc + ", merchant=" + merchant + "]";
    }

}
