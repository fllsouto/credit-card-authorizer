package br.com.fllsouto.interviews.caju.cca.domain.type;

import java.util.List;

public enum MerchantType {
    FOOD("food", List.of("5411", "5412")),
    MEAL("meal", List.of("5811", "5812")),
    CASH("cash", List.of());
    
    private String type;
    private List<String> mccCodes;

    private MerchantType(String type, List<String> mccCodes) {
        this.type = type;
        this.mccCodes = mccCodes;
    }

    public String getType() {
        return type;
    }

    public static MerchantType getTypeFrom(String mcc) {
        if (FOOD.mccCodes.contains(mcc))
            return FOOD;

        if (MEAL.mccCodes.contains(mcc))
            return MEAL;

        return CASH;
    }

    public static MerchantType getFallbackMerchantType() {
        return MerchantType.CASH;
    }

}