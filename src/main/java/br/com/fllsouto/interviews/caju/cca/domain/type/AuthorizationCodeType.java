package br.com.fllsouto.interviews.caju.cca.domain.type;

public enum AuthorizationCodeType {
    START("10"),
    APPROVED("00"),
    CONTINUE("23"),
    DENIED_LACK_OF_BALANCE("51"),
    DENIED_INTERNAL_ERROR("07");

    private String code;

    private AuthorizationCodeType(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public static boolean isAuthorized(AuthorizationCodeType code) {
        switch (code) {
            case START:
                return false;
            case APPROVED:
                return true;
            case CONTINUE:
                return false;
            case DENIED_LACK_OF_BALANCE:
                return false;
            case DENIED_INTERNAL_ERROR:
                return false;
            default:
                return false;
        }
    }

}
