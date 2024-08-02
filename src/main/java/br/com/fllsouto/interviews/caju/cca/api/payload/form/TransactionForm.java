package br.com.fllsouto.interviews.caju.cca.api.payload.form;

import java.math.BigDecimal;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonAlias;

public class TransactionForm {
    
    @JsonAlias("id")
    private UUID transactionUUID;
    @JsonAlias("accountId")
    private UUID accountUUID;
    private BigDecimal totalAmount;
    private String mcc;
    private String merchant;

    public UUID gettransactionUUID() {
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
        return "TransactionInput [id=" + id + ", accountId=" + accountId + ", totalAmount=" + totalAmount + ", mcc="
                + mcc + ", merchant=" + merchant + "]";
    }

}
