package br.com.fllsouto.interviews.caju.cca.api.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.CreateAccountForm;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.AccountOutput;
import br.com.fllsouto.interviews.caju.cca.service.ports.IAccountService;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/account")
public class AccountController {

    private IAccountService accountService;

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<AccountOutput> list() {
        return this.accountService.list();
    }
    
    @GetMapping("/{accountUUID}")
    public AccountOutput get(@PathVariable UUID accountUUID) {
        return this.accountService.get(accountUUID);
    }

    @PostMapping //TODO: Validate input data
    public AccountOutput create(@RequestBody CreateAccountForm form) {
        return this.accountService.create(form);
    }
}
