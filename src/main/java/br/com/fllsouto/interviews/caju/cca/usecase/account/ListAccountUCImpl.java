package br.com.fllsouto.interviews.caju.cca.usecase.account;

import java.util.List;
import br.com.fllsouto.interviews.caju.cca.domain.model.Account;
import br.com.fllsouto.interviews.caju.cca.domain.repository.AccountRepository;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.AccountUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.AccountUCOutput;

public class ListAccountUCImpl implements IAccountUC {

    private AccountRepository accountRepository;

    public ListAccountUCImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(AccountUCInput input, AccountUCOutput output) {
        List<Account> accounts =  accountRepository.findAll();
        output.setAcc(accounts);
    }
}
