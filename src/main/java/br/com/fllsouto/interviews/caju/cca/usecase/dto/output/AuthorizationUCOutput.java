package br.com.fllsouto.interviews.caju.cca.usecase.dto.output;

import java.util.Optional;

import br.com.fllsouto.interviews.caju.cca.api.payload.output.AuthorizationOutput;
import br.com.fllsouto.interviews.caju.cca.domain.model.Account;
import br.com.fllsouto.interviews.caju.cca.domain.type.AuthorizationCodeType;

public class AuthorizationUCOutput {
    AuthorizationCodeType code;
    Optional<Account> optAcc;

    public AuthorizationUCOutput(AuthorizationCodeType code) {
        this.code = code;
        this.optAcc = Optional.empty();
    }

    public AuthorizationUCOutput() {
        this(AuthorizationCodeType.START);
    }

    public AuthorizationCodeType getCode() {
        return code;
    }

    public boolean isAuthorized() {
        return AuthorizationCodeType.isAuthorized(this.code);
    }

    public AuthorizationOutput toOutput() {
        return new AuthorizationOutput(this.code);
    }

    public Account getAcc() {
        return optAcc.get();
    }

    public void setNewCode(AuthorizationCodeType code) {
        this.code = code;
    }

    public void setAcc(Optional<Account> optAcc) {
        this.optAcc = optAcc;
    }
}