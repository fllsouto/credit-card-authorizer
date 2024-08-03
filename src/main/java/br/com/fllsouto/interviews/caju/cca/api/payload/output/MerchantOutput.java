package br.com.fllsouto.interviews.caju.cca.api.payload.output;

import java.util.UUID;

import br.com.fllsouto.interviews.caju.cca.domain.type.MerchantType;

public class MerchantOutput {
    private UUID uuid;
    private String name;
    private String preferedType;
    private String fallbackType;

    public MerchantOutput(UUID uuid, String name, MerchantType preferedType, MerchantType fallbackType) {
        this.uuid = uuid;
        this.name = name;
        this.preferedType = preferedType.getType();
        this.fallbackType = fallbackType.getType();
    }

    public UUID getUUID() {
        return uuid;
    }
    public String getName() {
        return name;
    }
    public String getPreferedType() {
        return preferedType;
    }
    public String getFallbackType() {
        return fallbackType;
    }

    @Override
    public String toString() {
        return "MerchantOutput [uuid=" + uuid + ", name=" + name + ", preferedType=" + preferedType + ", fallbackType="
                + fallbackType + "]";
    }
}
