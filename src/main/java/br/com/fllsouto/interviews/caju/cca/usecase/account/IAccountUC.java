package br.com.fllsouto.interviews.caju.cca.usecase.account;

import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.AccountUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.AccountUCOutput;

public interface IAccountUC {
    public void run(AccountUCInput input, AccountUCOutput output);
}