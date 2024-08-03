package br.com.fllsouto.interviews.caju.cca.service.adapters;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.CreateAccountForm;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.AccountOutput;
import br.com.fllsouto.interviews.caju.cca.domain.repository.AccountRepository;
import br.com.fllsouto.interviews.caju.cca.service.ports.IAccountService;
import br.com.fllsouto.interviews.caju.cca.usecase.account.CreateAccountUCImpl;
import br.com.fllsouto.interviews.caju.cca.usecase.account.GetAccountUCImpl;
import br.com.fllsouto.interviews.caju.cca.usecase.account.IAccountUC;
import br.com.fllsouto.interviews.caju.cca.usecase.account.ListAccountUCImpl;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.AccountUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.AccountUCOutput;

// TODO: Create this using a factory
@Service
public class AccountServiceImpl implements IAccountService {

    private IAccountUC createAccountUC;
    private IAccountUC getAccountUC;
    private IAccountUC listAccountUC;

    public AccountServiceImpl(AccountRepository repository) {
        this.createAccountUC = new CreateAccountUCImpl(repository);
        this.getAccountUC = new GetAccountUCImpl(repository);
        this.listAccountUC = new ListAccountUCImpl(repository);
    }

    @Override
    public AccountOutput create(CreateAccountForm form) {
        AccountUCInput input = new AccountUCInput(form);
        AccountUCOutput output = new AccountUCOutput();

        this.createAccountUC.run(input, output);
        return output.mapToOutput();
    }

    @Override
    public AccountOutput get(UUID accountUUID) {
        AccountUCInput input = new AccountUCInput(accountUUID);
        AccountUCOutput output = new AccountUCOutput();

        this.getAccountUC.run(input, output);
        return output.mapToOutput();
    }

    @Override
    public List<AccountOutput> list() {
        AccountUCInput input = new AccountUCInput();
        AccountUCOutput output = new AccountUCOutput();

        this.listAccountUC.run(input, output);
        return output.mapToOutputList();
    }
}
