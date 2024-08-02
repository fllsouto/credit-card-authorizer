package br.com.fllsouto.interviews.caju.cca.usecase.account;

import br.com.fllsouto.interviews.caju.cca.domain.model.Account;
import br.com.fllsouto.interviews.caju.cca.domain.repository.AccountRepository;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.AccountUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.AccountUCOutput;

// TODO: Change to port and adapters naming convention
public class CreateAccountUCImpl implements IAccountUC{

    private AccountRepository accountRepository;

    public CreateAccountUCImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(AccountUCInput input, AccountUCOutput output) {
        Account acc = toDomainModel(input);
        Account newAcc = this.accountRepository.save(acc);
        output.update(newAcc);
    }

    private Account toDomainModel(AccountUCInput input) {
        return new Account(
            input.getFoodBalance(), 
            input.getMealBalance(), 
            input.getCashBalance()
        );
    }
}
