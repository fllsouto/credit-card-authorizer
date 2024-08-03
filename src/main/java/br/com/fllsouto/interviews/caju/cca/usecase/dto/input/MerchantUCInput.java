package br.com.fllsouto.interviews.caju.cca.usecase.dto.input;

import java.util.UUID;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.CreateMerchantForm;
import br.com.fllsouto.interviews.caju.cca.domain.type.MerchantType;

public class MerchantUCInput {
    private UUID uuid;
    private String name;
    private MerchantType preferedType;
    private MerchantType fallbackType;

    public MerchantUCInput() {}

    public MerchantUCInput(CreateMerchantForm form) {
        this.uuid = form.getUUID();
        this.name = form.getName();
        this.preferedType = MerchantType.getTypeFrom(form.getPreferedType());
        this.fallbackType = MerchantType.getFallbackMerchantType();
    }

    public MerchantUCInput(UUID uuid) {
        this.uuid = uuid;
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