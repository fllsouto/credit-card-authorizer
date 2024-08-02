package br.com.fllsouto.interviews.caju.cca.usecase.authorization;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fllsouto.interviews.caju.cca.domain.model.Account;
import br.com.fllsouto.interviews.caju.cca.domain.repository.AccountRepository;
import br.com.fllsouto.interviews.caju.cca.domain.type.AuthorizationCodeType;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.AuthorizationUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.AuthorizationUCOutput;

@Service
public class ValidateAuthorizationUCImpl implements IAuthorizationUC{

    private AccountRepository accountRepository;

    public ValidateAuthorizationUCImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // TODO: Refactor this after testing!
    @Override
    public void run(AuthorizationUCInput input, AuthorizationUCOutput output) {
        Optional<Account> optAcc = accountRepository.findByUUID(input.getAccountId());
        if (optAcc.isEmpty()) {
            output.setNewCode(AuthorizationCodeType.DENIED_INTERNAL_ERROR);
        } else {
            output.setNewCode(AuthorizationCodeType.CONTINUE);
            output.setAcc(optAcc);
        }
    }

}
