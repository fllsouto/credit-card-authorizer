package br.com.fllsouto.interviews.caju.cca.api.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.fllsouto.interviews.caju.cca.api.payload.input.CreateAccountInput;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.AccountOutput;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.CreateAccountOutput;
import br.com.fllsouto.interviews.caju.cca.domain.model.Account;
import br.com.fllsouto.interviews.caju.cca.usecase.account.CreateAccountUseCase;
import br.com.fllsouto.interviews.caju.cca.usecase.account.GetAccountUseCase;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/account")
public class AccountController {

    private CreateAccountUseCase createAccountUseCase;
    private GetAccountUseCase getAccountUseCase;

    public AccountController(CreateAccountUseCase createAccountUseCase, GetAccountUseCase getAccountUseCase) {
        this.createAccountUseCase = createAccountUseCase;
        this.getAccountUseCase = getAccountUseCase;
    }

    @GetMapping
    public List<AccountOutput> getAllAccounts() {
        return getAccountUseCase.execute();
    }

    @GetMapping("/{accountUuid}")
    public Optional<AccountOutput> getAccountById(@PathVariable UUID accountUuid) {
        return getAccountUseCase.execute(accountUuid);
    }

    @PostMapping //TODO: Validate input data
    public CreateAccountOutput createAccount(@RequestBody CreateAccountInput input) {
        CreateAccountOutput output = createAccountUseCase.execute(input);
        System.out.println("<---->");
        System.out.println(output);
        return output;
    }
}
