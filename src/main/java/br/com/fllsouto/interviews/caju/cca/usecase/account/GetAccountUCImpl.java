package br.com.fllsouto.interviews.caju.cca.usecase.account;

import java.util.Optional;
import br.com.fllsouto.interviews.caju.cca.domain.model.Account;
import br.com.fllsouto.interviews.caju.cca.domain.repository.AccountRepository;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.AccountUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.AccountUCOutput;

public class GetAccountUCImpl implements IAccountUC {

    private AccountRepository accountRepository;

    public GetAccountUCImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(AccountUCInput input, AccountUCOutput output) {
        Optional<Account> account = accountRepository.findByUUID(input.getUUID());
        output.setAcc(account);

        if (account.isPresent())
            output.update();
    }
}
