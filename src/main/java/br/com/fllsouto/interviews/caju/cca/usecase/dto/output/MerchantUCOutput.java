package br.com.fllsouto.interviews.caju.cca.usecase.dto.output;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

import br.com.fllsouto.interviews.caju.cca.domain.model.Merchant;
import br.com.fllsouto.interviews.caju.cca.domain.type.MerchantType;

public class MerchantUCOutput {
    private UUID uuid;
    private String name;
    private MerchantType preferedType;
    private MerchantType fallbackType;
    Optional<Merchant> optMerch;
    List<Merchant> merchs;

    public MerchantUCOutput(UUID uuid, String name, MerchantType preferedType, MerchantType fallbackType) {
        this.uuid = uuid;
        this.name = name;
        this.preferedType = preferedType;
        this.fallbackType = fallbackType;
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
    
    public void update(Merchant merchant) {
        this.uuid = merchant.getUUID();
        this.name = merchant.getName();
        this.preferedType = merchant.getPreferedType();
        this.fallbackType = merchant.getFallbackType();
    }

    public void setMerch(Optional<Merchant> optMerch) {
        this.optMerch = optMerch;
    }

    public void setMerch(List<Merchant> merchs) {
        this.merchs = merchs;
    }

}