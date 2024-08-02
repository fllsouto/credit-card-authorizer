package br.com.fllsouto.interviews.caju.cca.api.payload.output;

import java.util.UUID;

public class MerchantOutput {
    private UUID uuid;
    private String name;
    private String preferedType;
    private String fallbackType;

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

    
}
