package br.com.fllsouto.interviews.caju.cca.domain.type;

public enum AuthorizationCodeType {
    APPROVED("00"),
    DENIED_LACK_OF_BALANCE("51"),
    DENIED_INTERNAL_ERROR("07");

    private String code;

    private AuthorizationCodeType(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

}
