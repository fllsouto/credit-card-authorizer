package br.com.fllsouto.interviews.caju.cca.usecase.authorization;

import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.AuthorizationUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.AuthorizationUCOutput;

public interface IAuthorizationUC {
    public void run(AuthorizationUCInput input, AuthorizationUCOutput output);
}