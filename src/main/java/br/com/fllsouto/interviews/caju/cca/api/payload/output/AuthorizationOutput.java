package br.com.fllsouto.interviews.caju.cca.api.payload.output;

import br.com.fllsouto.interviews.caju.cca.domain.type.AuthorizationCodeType;

public class AuthorizationOutput {
    private String code;

    public AuthorizationOutput(AuthorizationCodeType code) {
        this.code = code.getCode();
    }

    @Override
    public String toString() {
        return "AuthorizationOutput [code=" + code + "]";
    }

    public String getCode() {
        return code;
    }
}
