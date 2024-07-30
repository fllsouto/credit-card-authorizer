package br.com.fllsouto.interviews.caju.cca.api.payload.output;

public class AuthorizationOutput {
    private String code;

    public AuthorizationOutput(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "AuthorizationOutput [code=" + code + "]";
    }

    public String getCode() {
        return code;
    }

}
