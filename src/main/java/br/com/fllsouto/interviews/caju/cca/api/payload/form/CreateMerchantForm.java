package br.com.fllsouto.interviews.caju.cca.api.payload.form;

import java.util.UUID;

public class CreateMerchantForm {

    private UUID uuid;
    private String name;
    private String preferedType;
    public UUID getUUID() {
        return uuid;
    }
    public String getName() {
        return name;
    }
    public String getPreferedType() {
        return preferedType;
    }

    

}
