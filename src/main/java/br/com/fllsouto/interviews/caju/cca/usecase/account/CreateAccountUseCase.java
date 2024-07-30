package br.com.fllsouto.interviews.caju.cca.usecase.account;

import org.springframework.stereotype.Service;

import br.com.fllsouto.interviews.caju.cca.api.payload.input.CreateAccountInput;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.CreateAccountOutput;
import br.com.fllsouto.interviews.caju.cca.domain.model.Account;
import br.com.fllsouto.interviews.caju.cca.domain.repository.AccountRepository;

// TODO: Change to port and adapters naming convention
@Service
public class CreateAccountUseCase {

    private AccountRepository accountRepository;

    public CreateAccountUseCase(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    
    public CreateAccountOutput execute(CreateAccountInput input){
        Account acc = toDomainModel(input);
        Account newAcc = this.accountRepository.save(acc);
        System.out.println(newAcc);
        return toOutput(newAcc);
    }

    private Account toDomainModel(CreateAccountInput input) {
        return new Account(
            input.getFoodBalance(), 
            input.getMealBalance(), 
            input.getCashBalance()
        );
    }

    private CreateAccountOutput toOutput(Account acc) {
        return new CreateAccountOutput(
            acc.getUUID(),
            acc.getFoodBalance(), 
            acc.getMealBalance(), 
            acc.getCashBalance()
        );
    }
}
