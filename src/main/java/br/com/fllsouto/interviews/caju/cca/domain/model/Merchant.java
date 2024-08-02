package br.com.fllsouto.interviews.caju.cca.domain.model;

import java.math.BigDecimal;
import java.util.UUID;

import br.com.fllsouto.interviews.caju.cca.domain.type.MerchantType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Merchant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;
    private String name;
    private MerchantType preferedType;
    private MerchantType fallbackType;
    
    public Merchant(String name, MerchantType preferedType) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.preferedType = preferedType;
        this.fallbackType = MerchantType.getFallbackMerchantType();
    }

    public Long getId() {
        return id;
    }

    public UUID getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public MerchantType getPreferedType() {
        return preferedType;
    }

    public MerchantType getFallbackType() {
        return fallbackType;
    }

    

    
}
