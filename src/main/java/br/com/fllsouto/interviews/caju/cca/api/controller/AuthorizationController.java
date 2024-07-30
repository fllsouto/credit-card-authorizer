package br.com.fllsouto.interviews.caju.cca.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fllsouto.interviews.caju.cca.api.payload.input.TransactionInput;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.AuthorizationOutput;
import br.com.fllsouto.interviews.caju.cca.usecase.authorization.SimpleAuthorizationUseCase;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/authorizer")
public class AuthorizationController {

    private SimpleAuthorizationUseCase simpleAuthorizationUseCase;

    public AuthorizationController(SimpleAuthorizationUseCase simpleAuthorizationUseCase) {
        this.simpleAuthorizationUseCase = simpleAuthorizationUseCase;
    }

    @GetMapping("/health")
    public String health() {
        return "up";
    }

    @PostMapping("/simple-auth")
    public AuthorizationOutput simpleAuthorization(@RequestBody TransactionInput input) {
        //System.out.println(input);
        AuthorizationOutput output = simpleAuthorizationUseCase.run(input);
        //System.out.println(output);
        //return new AuthorizationOutput("42");
        return output;
    }
    
    
}
