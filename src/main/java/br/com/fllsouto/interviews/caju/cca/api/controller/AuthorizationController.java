package br.com.fllsouto.interviews.caju.cca.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.TransactionForm;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.AuthorizationOutput;
import br.com.fllsouto.interviews.caju.cca.service.ports.IAuthorizationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/authorization")
public class AuthorizationController {

    private IAuthorizationService authorizationChainService;

    public AuthorizationController(IAuthorizationService authorizationChainService) {
        this.authorizationChainService = authorizationChainService;
    }

    // TODO: Validate input data
    @PostMapping
    public AuthorizationOutput authorize(@RequestBody TransactionForm form) {
        return this.authorizationChainService.authorize(form);
    }
}
