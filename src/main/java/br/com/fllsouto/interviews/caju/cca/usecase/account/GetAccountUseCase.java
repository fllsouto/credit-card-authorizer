package br.com.fllsouto.interviews.caju.cca.usecase.account;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.fllsouto.interviews.caju.cca.api.payload.output.AccountOutput;
import br.com.fllsouto.interviews.caju.cca.domain.model.Account;
import br.com.fllsouto.interviews.caju.cca.domain.repository.AccountRepository;

@Service
public class GetAccountUseCase {

    private AccountRepository accountRepository;

    public GetAccountUseCase(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // TODO: Replace if statement by an Optional 
    // TODO: Verify if I should create a common interface and base use case
    public Optional<AccountOutput> execute(UUID accountUuid) {
        Optional<Account> account = accountRepository.findByUuid(accountUuid);
        if (account.isPresent()) {
            return Optional.of(toOutput(account.get()));
        }
        return Optional.empty();
    }

    public List<AccountOutput> execute() {
        return accountRepository.findAll().stream()
            .map(this::toOutput).toList();
    }

    private AccountOutput toOutput(Account acc) {
        return new AccountOutput(
            acc.getUUID(),
            acc.getFoodBalance(), 
            acc.getMealBalance(), 
            acc.getCashBalance()
        );
    }
}
