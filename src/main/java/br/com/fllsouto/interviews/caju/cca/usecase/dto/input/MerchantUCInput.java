package br.com.fllsouto.interviews.caju.cca.usecase.dto.input;

import java.util.UUID;
import br.com.fllsouto.interviews.caju.cca.domain.type.MerchantType;

public class MerchantUCInput {
    private UUID uuid;
    private String name;
    private MerchantType preferedType;
    private MerchantType fallbackType;

    public MerchantUCInput(UUID uuid, String name, MerchantType preferedType) {
        this.uuid = uuid;
        this.name = name;
        this.preferedType = preferedType;
        this.fallbackType = MerchantType.getFallbackMerchantType();
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